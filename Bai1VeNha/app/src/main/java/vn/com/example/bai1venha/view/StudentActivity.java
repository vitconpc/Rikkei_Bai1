package vn.com.example.bai1venha.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import vn.com.example.bai1venha.R;
import vn.com.example.bai1venha.common.Constants;
import vn.com.example.bai1venha.model.Student;

public class StudentActivity extends AppCompatActivity {

    private TextView txtName;
    private EditText edtCountry;
    private EditText edtBirthday;
    private EditText edtGender;
    private EditText edtClass;
    private EditText edtCource;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        initView();
        getData();
    }

    private void getData() {
        txtName.setText(getIntent().getStringExtra(Constants.NAME));
    }

    private void initView() {
        txtName = findViewById(R.id.txt_student_name);
        edtBirthday = findViewById(R.id.edt_birthday);
        edtClass = findViewById(R.id.edt_class);
        edtCountry = findViewById(R.id.edt_country);
        edtCource = findViewById(R.id.edt_cource);
        edtGender = findViewById(R.id.edt_gender);
    }

    public void goToStudentInfor(View view) {
        Student student = new Student();
        student.setBirthday(edtBirthday.getText().toString().trim());
        student.setClassroom(edtClass.getText().toString().trim());
        student.setCountry(edtCountry.getText().toString().trim());
        student.setCource(edtCource.getText().toString().trim());
        student.setGender(edtGender.getText().toString().trim());
        student.setName(txtName.getText().toString().trim());

        Intent intent = new Intent(this,StudentInforActivity.class);
        intent.putExtra(Constants.STUDENT,student);
        startActivity(intent);
    }
}
