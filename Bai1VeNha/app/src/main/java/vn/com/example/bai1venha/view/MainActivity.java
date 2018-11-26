package vn.com.example.bai1venha.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import vn.com.example.bai1venha.R;
import vn.com.example.bai1venha.common.Constants;

public class MainActivity extends AppCompatActivity {

    private EditText txtStudentName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        txtStudentName = findViewById(R.id.txt_student_name);
    }

    public void goToStudent(View view) {
        String name = txtStudentName.getText().toString().trim();
        if (name.isEmpty()){
            txtStudentName.setError(getString(R.string.not_enter_name));
            return;
        }
        Intent intent = new Intent(this,StudentActivity.class);
        intent.putExtra(Constants.NAME,name);
        startActivity(intent);
    }
}
