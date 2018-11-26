package vn.com.example.bai1venha.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import vn.com.example.bai1venha.R;
import vn.com.example.bai1venha.common.Constants;
import vn.com.example.bai1venha.model.Student;

public class StudentInforActivity extends AppCompatActivity {

    private TextView txtName;
    private TextView txtCountry;
    private TextView txtBirthday;
    private TextView txtGender;
    private TextView txtClass;
    private TextView txtCource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_infor);
        initView();
        initData();
    }

    private void initData() {
        Intent intent = getIntent();
        if (intent != null) {
            Student student = intent.getParcelableExtra(Constants.STUDENT);
            txtName.setText(student.getName());
            txtGender.setText(student.getGender());
            txtCource.setText(student.getCource());
            txtCountry.setText(student.getCountry());
            txtClass.setText(student.getClassroom());
            txtBirthday.setText(student.getBirthday());
        }

    }

    private void initView() {
        txtBirthday = findViewById(R.id.txt_birthday);
        txtClass = findViewById(R.id.txt_class);
        txtCountry = findViewById(R.id.txt_country);
        txtCource = findViewById(R.id.txt_cource);
        txtGender = findViewById(R.id.txt_gender);
        txtName = findViewById(R.id.txt_student_name);
    }

    public void onBack(View view) {
        onBackPressed();
    }
}
