package com.example.android.fifaworldcupquiz2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Reset is disabled at the start of the application, only be enabled when user submits all the answers.
        Button resetButton = (Button) findViewById(R.id.reset);
        resetButton.setEnabled(false);
    }

    /**
     * This method is called when the Submit button is clicked.
     */
    public void submitButton(View view) {
        /*Local Variables*/
        int correct = 0;
        int questionsAnswered = 0;

        //For Question No. 1
        EditText ques1Ans1 = (EditText) findViewById(R.id.ans_field);
        String ans1 = ques1Ans1.getText().toString();
        if (!ans1.isEmpty()) {
            questionsAnswered++;
            String ans = "russia";
            ans1 = ans1.trim();
            boolean issame = ans1.equalsIgnoreCase(ans);
            if (issame)
                correct++;
        }

        //For Question No.2
        RadioButton ques2Ans1 = (RadioButton) findViewById(R.id.ques_2_radiobutton_1); //Correct answer
        RadioButton ques2Ans2 = (RadioButton) findViewById(R.id.ques_2_radiobutton_2);
        RadioButton ques2Ans3 = (RadioButton) findViewById(R.id.ques_2_radiobutton_3);
        if (ques2Ans1.isChecked()) {
            correct++;
            questionsAnswered++;
        } else if (ques2Ans2.isChecked()) {
            questionsAnswered++;
        } else if (ques2Ans3.isChecked()) {
            questionsAnswered++;
        }

        //For Question No.3
        RadioButton ques3Ans1 = (RadioButton) findViewById(R.id.ques_3_radiobutton_1); //Correct answer
        RadioButton ques3Ans2 = (RadioButton) findViewById(R.id.ques_3_radiobutton_2);
        RadioButton ques3Ans3 = (RadioButton) findViewById(R.id.ques_3_radiobutton_3);
        if (ques3Ans1.isChecked()) {
            correct++;
            questionsAnswered++;
        } else if (ques3Ans2.isChecked()) {
            questionsAnswered++;
        } else if (ques3Ans3.isChecked()) {
            questionsAnswered++;
        }

        //For Question No.4
        RadioButton ques4Ans1 = (RadioButton) findViewById(R.id.ques_4_radiobutton_1);
        RadioButton ques4Ans2 = (RadioButton) findViewById(R.id.ques_4_radiobutton_2);
        RadioButton ques4Ans3 = (RadioButton) findViewById(R.id.ques_4_radiobutton_3); //Correct answer
        if (ques4Ans1.isChecked()) {
            questionsAnswered++;
        } else if (ques4Ans2.isChecked()) {
            questionsAnswered++;
        } else if (ques4Ans3.isChecked()) {
            correct++;
            questionsAnswered++;
        }

        //For question No.5
        RadioButton ques5Ans1 = (RadioButton) findViewById(R.id.ques_5_radiobutton_1);
        RadioButton ques5Ans2 = (RadioButton) findViewById(R.id.ques_5_radiobutton_2); //Correct answer
        RadioButton ques5Ans3 = (RadioButton) findViewById(R.id.ques_5_radiobutton_3);
        if (ques5Ans1.isChecked()) {
            questionsAnswered++;
        } else if (ques5Ans2.isChecked()) {
            correct++;
            questionsAnswered++;
        } else if (ques5Ans3.isChecked()) {
            questionsAnswered++;
        }

        //For Question No. 6
        RadioButton ques6Ans1 = (RadioButton) findViewById(R.id.ques_6_radiobutton_1);
        RadioButton ques6Ans2 = (RadioButton) findViewById(R.id.ques_6_radiobutton_2);
        RadioButton ques6Ans3 = (RadioButton) findViewById(R.id.ques_6_radiobutton_3); //Correct answer
        if (ques6Ans1.isChecked()) {
            questionsAnswered++;
        } else if (ques6Ans2.isChecked()) {
            questionsAnswered++;
        } else if (ques6Ans3.isChecked()) {
            correct++;
            questionsAnswered++;
        }

        //For Question No.7
        RadioButton ques7Ans1 = (RadioButton) findViewById(R.id.ques_7_radiobutton_1);
        RadioButton ques7Ans2 = (RadioButton) findViewById(R.id.ques_7_radiobutton_2); //Correct answer
        RadioButton ques7Ans3 = (RadioButton) findViewById(R.id.ques_7_radiobutton_3);
        if (ques7Ans1.isChecked()) {
            questionsAnswered++;
        } else if (ques7Ans2.isChecked()) {
            correct++;
            questionsAnswered++;
        } else if (ques7Ans3.isChecked()) {
            questionsAnswered++;
        }

        //For Question No.8
        RadioButton ques8Ans1 = (RadioButton) findViewById(R.id.ques_8_radiobutton_1);
        RadioButton ques8Ans2 = (RadioButton) findViewById(R.id.ques_8_radiobutton_2); //Correct answer
        RadioButton ques8Ans3 = (RadioButton) findViewById(R.id.ques_8_radiobutton_3);
        if (ques8Ans1.isChecked()) {
            questionsAnswered++;
        } else if (ques8Ans2.isChecked()) {
            correct++;
            questionsAnswered++;
        } else if (ques8Ans3.isChecked()) {
            questionsAnswered++;
        }

        //For Question No.9
        RadioButton ques9Ans1 = (RadioButton) findViewById(R.id.ques_9_radiobutton_1);
        RadioButton ques9Ans2 = (RadioButton) findViewById(R.id.ques_9_radiobutton_2);
        RadioButton ques9Ans3 = (RadioButton) findViewById(R.id.ques_9_radiobutton_3); //Correct answer
        if (ques9Ans1.isChecked()) {
            questionsAnswered++;
        } else if (ques9Ans2.isChecked()) {
            questionsAnswered++;
        } else if (ques9Ans3.isChecked()) {
            correct++;
            questionsAnswered++;
        }

        //For Question No.10
        CheckBox ques10Ans1 = (CheckBox) findViewById(R.id.ques_10_checkbutton_1); //Correct answer
        CheckBox ques10Ans2 = (CheckBox) findViewById(R.id.ques_10_checkbutton_2);
        CheckBox ques10Ans3 = (CheckBox) findViewById(R.id.ques_10_checkbutton_3); //Correct answer
        if (ques10Ans1.isChecked() || ques10Ans2.isChecked() || ques10Ans3.isChecked()) {
            questionsAnswered++;
            if (ques10Ans1.isChecked() && ques10Ans3.isChecked())
                correct++;
        }

        //Toast, If the user doesn't answer all the question then return
        if (questionsAnswered != 10) {
            String text = getString(R.string.toast_display);
            Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
            return;
        }

        //Submit is disabled when user submits to see the result
        Button submitButton = (Button) findViewById(R.id.submit);
        submitButton.setEnabled(false);

        //Reset is enabled to start the application again
        Button resetButton = (Button) findViewById(R.id.reset);
        resetButton.setEnabled(true);

        String text = getString(R.string.correct_no_of_ans, correct);
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();

    }

    /**
     * This method is called when the Reset button is clicked.
     */
    public void resetButton(View view) {
        EditText ansHeader = (EditText) findViewById(R.id.ans_field);
        ansHeader.setText("");

        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.radiogroup2);
        radioGroup2.clearCheck();

        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.radiogroup3);
        radioGroup3.clearCheck();

        RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.radiogroup4);
        radioGroup4.clearCheck();

        RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.radiogroup5);
        radioGroup5.clearCheck();

        RadioGroup radioGroup6 = (RadioGroup) findViewById(R.id.radiogroup6);
        radioGroup6.clearCheck();

        RadioGroup radioGroup7 = (RadioGroup) findViewById(R.id.radiogroup7);
        radioGroup7.clearCheck();

        RadioGroup radioGroup8 = (RadioGroup) findViewById(R.id.radiogroup8);
        radioGroup8.clearCheck();

        RadioGroup radioGroup9 = (RadioGroup) findViewById(R.id.radiogroup9);
        radioGroup9.clearCheck();

        CheckBox checkBox1 = (CheckBox) findViewById(R.id.ques_10_checkbutton_1);
        checkBox1.setChecked(false);

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.ques_10_checkbutton_2);
        checkBox2.setChecked(false);

        CheckBox checkBox3 = (CheckBox) findViewById(R.id.ques_10_checkbutton_3);
        checkBox3.setChecked(false);

        Button submitButton = (Button) findViewById(R.id.submit);
        submitButton.setEnabled(true);

        Button resetButton = (Button) findViewById(R.id.reset);
        resetButton.setEnabled(false);
    }
}
