package sg.edu.rp.c346.healthyhabit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    TimePicker tp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.button);
        tp = findViewById(R.id.timePicker);
        tp.setIs24HourView(true);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int hr = tp.getCurrentHour();
                int min = tp.getCurrentMinute();



                if(hr >= 18 && hr < 19){
                    Toast.makeText(MainActivity.this, "Great! You have a healthy eating habit", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Not so ideal to eat at this hour", Toast.LENGTH_SHORT).show();
                }



            }
        });
    }
}
