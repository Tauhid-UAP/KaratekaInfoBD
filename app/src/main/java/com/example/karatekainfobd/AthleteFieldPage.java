package com.example.karatekainfobd;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class AthleteFieldPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_athlete_field_page);


        // Setting up the CheckBox'es' and categoryField Spinner

        final CheckBox maleCheckBox=(CheckBox) findViewById(R.id.maleCheckBox);
        final CheckBox femaleCheckBox=(CheckBox) findViewById(R.id.femaleCheckBox);

        final Spinner kumiteEventField=(Spinner)findViewById(R.id.kumiteEventField);
        final Spinner kataEventField=(Spinner) findViewById(R.id.kataEventField);

        // set adapter for maleKumiteEvents
        final ArrayAdapter<CharSequence> maleKumiteArrayAdapter=ArrayAdapter.createFromResource(this, R.array.maleKumiteEvents, android.R.layout.simple_spinner_item);
        maleKumiteArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // set adapter for femaleKumiteEvents
        final ArrayAdapter<CharSequence> femaleKumiteArrayAdapter=ArrayAdapter.createFromResource(this, R.array.femaleKumiteEvents, android.R.layout.simple_spinner_item);
        femaleKumiteArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // set adapter for maleKataEvents

        final ArrayAdapter<CharSequence> maleKataArrayAdapter=ArrayAdapter.createFromResource(this, R.array.maleKataEvents, android.R.layout.simple_spinner_item);
        maleKataArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // set adapter for femaleKataEvents

        final ArrayAdapter<CharSequence> femaleKataArrayAdapter=ArrayAdapter.createFromResource(this, R.array.femaleKataEvents, android.R.layout.simple_spinner_item);
        femaleKataArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        maleCheckBox.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                maleCheckBox.setChecked(true);

                femaleCheckBox.setChecked(false);

                kumiteEventField.setAdapter(maleKumiteArrayAdapter);

                kataEventField.setAdapter(maleKataArrayAdapter);

            }

        });

        femaleCheckBox.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                femaleCheckBox.setChecked(true);

                maleCheckBox.setChecked(false);

                kumiteEventField.setAdapter(femaleKumiteArrayAdapter);

                kataEventField.setAdapter(femaleKataArrayAdapter);

            }

        });

        Button dateOfBirthField=(Button) findViewById(R.id.dateOfBirthField);

        dateOfBirthField.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showDatePickerDialog();

            }
        });

        // Setting up the clubField and teamField Spinners

        final Spinner clubField=(Spinner) findViewById(R.id.clubField);
        final Spinner teamField=(Spinner) findViewById(R.id.teamField);

        ArrayAdapter<CharSequence> clubFieldArrayAdapter=ArrayAdapter.createFromResource(this, R.array.clubs, android.R.layout.simple_spinner_item);
        clubFieldArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        clubField.setAdapter(clubFieldArrayAdapter);

        ArrayAdapter<CharSequence> teamFieldArrayAdapter=ArrayAdapter.createFromResource(this, R.array.teams, android.R.layout.simple_spinner_item);
        clubFieldArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        teamField.setAdapter(teamFieldArrayAdapter);

    }

    private void showDatePickerDialog() {

        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {

                        Button dateOfBirthField = (Button) findViewById(R.id.dateOfBirthField);

                        dateOfBirthField.setText("" + dayOfMonth + "-" + (month+1) + "-" + year);

                        return;

                    }
                },
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH)

        );

        datePickerDialog.show();

    }

}
