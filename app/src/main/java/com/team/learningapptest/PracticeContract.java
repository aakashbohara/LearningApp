package com.team.learningapptest;

import android.provider.BaseColumns;

public final class PracticeContract {

    private PracticeContract() {}

    public static class QuestionTable implements BaseColumns {
        public static final String TABLE_NAME = "practice_question";
        public static final String COLUMN_QUESTION = "question";
        public static final String COLUMN_OPTION1 = "option1";
        public static final String COLUMN_OPTION2 = "option2";
        public static final String COLUMN_OPTION3 = "option3";
        public static final String COLUMN_ANSWER_NR ="answer_nr";

    }

}
