package com.example.admin.myreportcardapplication;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ThemedSpinnerAdapter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.example.admin.myreportcardapplication.R.id.btn_sigroup;
import static com.example.admin.myreportcardapplication.R.id.gender_textview;

public class TeacherRegistrationActivity extends AppCompatActivity {
DatabaseHelper helper = new DatabaseHelper(this );
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_registration);
        Button sinup = (Button) findViewById(btn_sigroup);

        sinup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r = new Intent(TeacherRegistrationActivity.this, RegisterActivity.class);
                startActivity(r);
            }
        });

    }

    public void onSingUpClick(View v) {
        Intent s = new Intent(TeacherRegistrationActivity.this,RegisterActivity.class);
        startActivity(s);
        EditText name = (EditText) findViewById(R.id.sigroup_input_name);
        EditText username = (EditText) findViewById(R.id.sigroup_input_username);

        EditText password = (EditText) findViewById(R.id.sigroup_input_password);
        EditText confirmpassword = (EditText) findViewById(R.id.sigroup_input_passwords);
        EditText id = (EditText) findViewById(R.id.sigroup_input_id);


        String names = name.getText().toString();

        String usernames = username.getText().toString();
        String passwords = password.getText().toString();
        String confrimsspassword = password.getText().toString();
        String ids = id.getText().toString();

        if (v.getId() == R.id.btn_sigroup) {

       }

            if (passwords.equals(confrimsspassword)) {
                Toast pass = Toast.makeText(TeacherRegistrationActivity.this, "password does maths", Toast.LENGTH_SHORT);
                pass.show();

//                 RadioButton gender = ( RadioButton)findViewById(R.id. male_radio_btn);
//
//
//            boolean checked = ((RadioButton)v).isChecked();
//            switch (v.getId())
//            {
//                case R.id.female_radio_btn:
//                    break;
//                case R.id.male_radio_btn:
//           h         break;
//            }


            }

            else {
                //insert the database
                Details d = new Details();
                d.setName(names);
                d.setUsername(usernames);
                d.setPassword(passwords);
                d.setConfrimpassword(confrimsspassword);
                d.setId(ids);
                helper.insertDetails(d);
                Toast pass = Toast.makeText(TeacherRegistrationActivity.this, "password does maths", Toast.LENGTH_SHORT);
                pass.show();

            }



        }
    }
