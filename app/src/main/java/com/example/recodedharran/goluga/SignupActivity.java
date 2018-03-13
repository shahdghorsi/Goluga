package com.example.recodedharran.goluga;


import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.view.WindowManager;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

import butterknife.BindView;

public class SignupActivity extends AppCompatActivity {

    String LOG = SignupActivity.class.getSimpleName();

    String monthString;
    String dayString;
    String yearString;
    EditText editTextDay;
    EditText editTextYear;
    EditText editTextMonth;
    @BindView(R.id.sign_up_error_text_view)
    TextView signUpErrorTextView;
    @BindView(R.id.sign_up_first_name_edit_text)
    EditText signUpFirstNameEditTex;
    @BindView(R.id.sign_up_last_name_edit_text)
    EditText signUpLastNameEditText;
    @BindView(R.id.sign_up_user_name_edit_text)
    EditText signUpUserNameEditText;
    @BindView(R.id.sign_up_pass_edit_text)
    EditText signUpPassEditText;
    @BindView(R.id.sign_up_confirm_pass_edit_text)
    EditText signUpConfirmPassEditTExt;

    Calendar myCalendar = Calendar.getInstance();
    DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

            // date Strings
            monthString = String.valueOf(monthOfYear + 1);
            dayString = String.valueOf(dayOfMonth);
            yearString = String.valueOf(year);

            // convert Integer month to String
            switch (monthString) {
                case "1":
                    monthString = "January";
                    break;
                case "2":
                    monthString = "February";
                    break;
                case "3":
                    monthString = "March";
                    break;
                case "4":
                    monthString = "April";
                    break;
                case "5":
                    monthString = "May";
                    break;
                case "6":
                    monthString = "June";
                    break;
                case "7":
                    monthString = "July";
                    break;
                case "8":
                    monthString = "August";
                    break;
                case "9":
                    monthString = "September";
                    break;
                case "10":
                    monthString = "October";
                    break;
                case "11":
                    monthString = "November";
                    break;
                case "12":
                    monthString = "December";
                    break;
            }

            myCalendar.set(Calendar.YEAR, year);
            myCalendar.set(Calendar.MONTH, monthOfYear);
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            updateLabel();
        }

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        // disable auto focus on edit text
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        // Date picker editTexts
        editTextYear = findViewById(R.id.birthday_year);
        editTextMonth = findViewById(R.id.birthday_month);
        editTextDay = findViewById(R.id.birthday_day);

        // Make edit texts uneditable
        editTextDay.setInputType(InputType.TYPE_NULL);
        editTextYear.setInputType(InputType.TYPE_NULL);
        editTextMonth.setInputType(InputType.TYPE_NULL);

        // set Default date
        editTextMonth.setText("1");
        editTextYear.setText("1900");
        editTextDay.setText("January");

        editTextDay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                new DatePickerDialog(SignupActivity.this, date,
                        myCalendar.get(Calendar.YEAR),
                        myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)
                )
                        .show();
            }
        });


        editTextMonth.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                new DatePickerDialog(SignupActivity.this, date,
                        myCalendar.get(Calendar.YEAR),
                        myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)
                )
                        .show();
            }
        });


        editTextYear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                new DatePickerDialog(SignupActivity.this, date,
                        myCalendar.get(Calendar.YEAR),
                        myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)
                )
                        .show();
            }
        });


    }

    // update the date
    private void updateLabel() {

        editTextDay.setText(monthString);
        editTextMonth.setText(dayString);
        editTextYear.setText(yearString);

    }


}