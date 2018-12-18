package piw.ruts.ac.th.lab1_basic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class calculator extends AppCompatActivity {

   private EditText editData;
   private RadioGroup Group;
   private String strTemperature,strTemRadio="Celsius",strAnwer;
   private  double douAnswer;
    private Button HomePage,Cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        editData = (EditText) findViewById(R.id.editTemparature);
        Group = (RadioGroup) findViewById(R.id.radioGroup);


        HomePage = (Button) findViewById(R.id.btnHomeOage);

        HomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(calculator.this, Profile.class);
                startActivity(intent);
            }
        });


        Cal = (Button) findViewById(R.id.bntCalculate);

        Cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    strTemperature = editData.getText().toString().trim();
                    if (strTemperature.equals("")){
                        Log.d("Space","It Have space in Blank");

                    }
                    else if (strTemRadio=="Celsius") {

                        Intent intent = new Intent(calculator.this, Result.class);
                        startActivity(intent);
                        Log.d("Pass","It Have space in Data");
                    }
                    else if (strTemRadio=="Kalvin") {

                        Intent intent = new Intent(calculator.this, Result.class);
                        startActivity(intent);
                        Log.d("Pass","It Have space in Data");
                    }
                    else if (strTemRadio=="Fahrenheit") {

                        Intent intent = new Intent(calculator.this, Result.class);
                        startActivity(intent);
                        Log.d("Pass","It Have space in Data");
                    }
                }catch (Exception e){}


            }
        });

        Group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case  R.id.radioCel:
                        strTemRadio ="Celsius";
                    case  R.id.radioFaren:
                        strTemRadio ="Fahrenheit";
                    case  R.id.radioKil:
                        strTemRadio ="Kalvin";
                }
            }
        });


    }
}
