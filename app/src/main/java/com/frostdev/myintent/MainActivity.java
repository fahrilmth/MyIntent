package com.frostdev.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMove = findViewById(R.id.btn_move_act);
        Button btnMoveData = findViewById(R.id.btn_move_data);
        Button btnMOveWithObject = findViewById(R.id.btn_move_object);

        btnMove.setOnClickListener(this);
        btnMoveData.setOnClickListener(this);
        btnMOveWithObject.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_act:
                Intent i = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(i);
                break;
            case R.id.btn_move_data:
                Intent intent = new Intent(MainActivity.this, MoveWithDataActivity.class);
                intent.putExtra(MoveWithDataActivity.EXTRA_NAME, "DicodingAcademy Boy");
                intent.putExtra(MoveWithDataActivity.EXTRA_AGE, 5);
                startActivity(intent);
                break;
            case R.id.btn_move_object:
                Person person = new Person();
                person.setName("Dicoding Academy");
                person.setEmail("academy@gmail.com");
                person.setAge(5);
                person.setCity("Bandung");

                Intent moveWithObject = new Intent(MainActivity.this, MoveWithObjectActivity.class);
                moveWithObject.putExtra(MoveWithObjectActivity.EXTRA_PERSON, person);
                startActivity(moveWithObject);
                break;
        }
    }
}