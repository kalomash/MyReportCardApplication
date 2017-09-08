package com.example.admin.myreportcardapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button   studentSin =  (Button)findViewById(R.id.StudentSign);
        Button   teacherSin =  (Button)findViewById(R.id.TeacherSign);
        Button   teacherlogin = (Button) findViewById(R.id.login_teacher);
        Button   studentlogin = (Button) findViewById(R.id.login_student);
        studentSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(LoginActivity.this,StudentRegistrationActivity.class);
                startActivity(s);

            }
        });

        teacherSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t = new Intent(LoginActivity.this,TeacherRegistrationActivity .class);
                startActivity(t);

            }
        });
        teacherlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(l);

            }
        });
        studentlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(LoginActivity.this,StudentReportActivity.class);
                startActivity(s);
            }
        });

    }
}
