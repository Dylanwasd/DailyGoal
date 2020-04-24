package sg.edu.rp.c346.dailygoal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup rg1 = (RadioGroup) findViewById(R.id.radioGroup1);
                RadioGroup rg2 = (RadioGroup) findViewById(R.id.radioGroup2);
                RadioGroup rg3 = (RadioGroup) findViewById(R.id.radioGroup3);
                int selectedButtonId1 = rg1.getCheckedRadioButtonId();
                int selectedButtonId2 = rg3.getCheckedRadioButtonId();
                int selectedButtonId3 = rg2.getCheckedRadioButtonId();
                RadioButton rb1 = (RadioButton) findViewById(selectedButtonId1);
                RadioButton rb2 = (RadioButton) findViewById(selectedButtonId2);
                RadioButton rb3 = (RadioButton) findViewById(selectedButtonId3);
                EditText ed = (EditText) findViewById(R.id.editText);

                String[] info = {rb1.getText().toString(),rb2.getText().toString(), rb3.getText().toString(), ed.getText().toString()};
                Intent i = new Intent(MainActivity.this, Summary.class);
                i.putExtra("info",info);
                startActivity(i);
            }
        });


    }
}

                // Get the Id of the selected radio button in the RadioGroup

                // Get the radio button object from the Id we had gotten above
