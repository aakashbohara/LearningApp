package com.team.learningapptest;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class practice extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice2);



    }
    public void submit(View view) {
        String[] answers = extractAnswer();
        int result = compareAnswers(answers);
        displayResult(result);
    }

    public String[] extractAnswer() {
        String[] ret = new String[5];
        EditText editTextStudentName = findViewById(R.id.studentName);
        ret[0] = evaluateRadioGroup(R.id.radio_group_question_1);
        ret[1] = evaluateRadioGroup(R.id.radio_group_question_2);
        ret[2] = evaluateRadioGroup(R.id.radio_group_question_3);
        ret[3] = evaluateRadioGroup(R.id.radio_group_question_4);
        ret[4] = evaluateRadioGroup(R.id.radio_group_question_5);
        return ret;
    }

    public int compareAnswers(String[] answers) {
        int result = 0;
        String[] correctAnswers = {"B. π", "A. 2", "B. cubic units.", "B. less than 90 degree", "A. 2πr."};
        for (int i = 0; i < correctAnswers.length; i++) {
            if (answers[i].equals(correctAnswers[i])) {
                result++;
            }
        }
        return result;
    }

    public void displayResult(int result) {

        EditText editTextStudentName = findViewById(R.id.studentName);
        String student = editTextStudentName.getText().toString().toUpperCase();

        String message = student + " got " + result + " out of 5. ";
        if (result == 0) {
            message += "Poor luck.";
        } else if (result == 1) {
            message += "You could do better.";
        } else if (result == 2) {
            message += "Quite nice.";
        } else if (result == 3) {
            message += "Really nice.";
        } else if (result == 4) {
            message += "Great!";
        } else if (result == 5) {
            message += "Absolutely awesome!";
        }

        Toast reportResult = Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT);
        reportResult.show();
    }

    private String evaluateRadioGroup(int id) {
        RadioGroup radioGroupQuestion;
        RadioButton radioButtonQuestion;

        radioGroupQuestion = findViewById(id);

        int radioButtonId = radioGroupQuestion.getCheckedRadioButtonId();
        radioButtonQuestion = findViewById(radioButtonId);

        if (radioButtonQuestion == null) {
            return "";
        }

        return (String)radioButtonQuestion.getText();
    }

    public void reset(View view) {
        EditText editText = findViewById(R.id.studentName);
        editText.setText("");

        RadioGroup radioGroup1 = findViewById(R.id.radio_group_question_1);
        radioGroup1.clearCheck();

        RadioGroup radioGroup2 = findViewById(R.id.radio_group_question_2);
        radioGroup2.clearCheck();

        RadioGroup radioGroup3 = findViewById(R.id.radio_group_question_3);
        radioGroup3.clearCheck();

        RadioGroup radioGroup4 = findViewById(R.id.radio_group_question_4);
        radioGroup4.clearCheck();

        RadioGroup radioGroup5 = findViewById(R.id.radio_group_question_5);
        radioGroup5.clearCheck();


    }

}
