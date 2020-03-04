package com.team.learningapptest;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;


public class PracticeHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "MyAwesomePractice.db";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase db;

    public PracticeHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTIOBS_TABLE ="CREATE TABLE" +
                PracticeContract.QuestionTable.TABLE_NAME + " ( " +
                PracticeContract.QuestionTable._ID + "INTEGER PRIMARY KEY AUTOINCREMENT, " +
                PracticeContract.QuestionTable.COLUMN_QUESTION + " TEXT, " +
                PracticeContract.QuestionTable.COLUMN_OPTION1 + " TEXT, " +
                PracticeContract.QuestionTable.COLUMN_OPTION2 + " TEXT, " +
                PracticeContract.QuestionTable.COLUMN_OPTION3 + " TEXT, " +
                PracticeContract.QuestionTable.COLUMN_ANSWER_NR + " INTEGER " +
                ")";

        db.execSQL(SQL_CREATE_QUESTIOBS_TABLE);
        fillQuestionTable();




    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + PracticeContract.QuestionTable.TABLE_NAME);
        onCreate(db);
    }
    private void fillQuestionTable() {
        Question q1 = new Question("A is correct", "A", "B", "C", 1);
        addQuestion(q1);

        Question q2 = new Question("B is correct", "A", "B", "C", 2);
        addQuestion(q2);

        Question q3 = new Question("C is correct", "A", "B", "C", 3);
        addQuestion(q3);

        Question q4 = new Question("A is correct again", "A", "B", "C", 1);
        addQuestion(q4);

        Question q5 = new Question("B is correct again", "A", "B", "C", 2);
        addQuestion(q5);
    }

    private void addQuestion(Question question){
        ContentValues cv = new ContentValues();
        cv.put(PracticeContract.QuestionTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(PracticeContract.QuestionTable.COLUMN_OPTION1, question.getQuestion1());
        cv.put(PracticeContract.QuestionTable.COLUMN_OPTION2, question.getQuestion2());
        cv.put(PracticeContract.QuestionTable.COLUMN_OPTION3, question.getQuestion3());
        cv.put(PracticeContract.QuestionTable.COLUMN_ANSWER_NR, question.getQuestion());
        db.insert(PracticeContract.QuestionTable.TABLE_NAME, null, cv);
    }

    public List<Question> getAllQuestions(){
        List<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM" + PracticeContract.QuestionTable.TABLE_NAME, null);
        if (c.moveToFirst()){
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(PracticeContract.QuestionTable.COLUMN_QUESTION)));
                question.setQuestion1(c.getString(c.getColumnIndex(PracticeContract.QuestionTable.COLUMN_OPTION1)));
                question.setQuestion2(c.getString(c.getColumnIndex(PracticeContract.QuestionTable.COLUMN_OPTION2)));
                question.setQuestion3(c.getString(c.getColumnIndex(PracticeContract.QuestionTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(PracticeContract.QuestionTable.COLUMN_ANSWER_NR)));
                questionList.add(question);





            }while (c.moveToNext());
        }

        c.close();
        return questionList;
    }



}
