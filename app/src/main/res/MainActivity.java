package application.ex_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    TextView txtview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         button1 = (Button) findViewById(R.id.btn1);
         button2 = (Button) findViewById(R.id.btn2);
         button3 = (Button) findViewById(R.id.btn3);
         txtview = (TextView) findViewById(R.id.txtid);
         button1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 txtview.setTextSize(60);
             }
         });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setTextColor(Color.RED);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setBackgroundColor(Color.BLUE);
            }
        });

    }
}