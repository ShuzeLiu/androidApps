package shuzeliu.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tipTotalTextView;
    TextView TotalTextView;
    EditText billTotalEditView;
    Button fifteenPercent;
    Button eighteenPercent;
    Button twentyPercent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tipTotalTextView = (TextView) findViewById(R.id.tipTotalTextView);
        TotalTextView = (TextView) findViewById(R.id.TotalTextView);
        billTotalEditView = (EditText) findViewById(R.id.billTotalEditView);
        fifteenPercent = (Button) findViewById(R.id.fifteenPercent);
        eighteenPercent = (Button) findViewById(R.id.eighteenPercent);
        twentyPercent = (Button) findViewById(R.id.twentyPercent);

        fifteenPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcTheTip(0.15);
            }
        });

        eighteenPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcTheTip(0.18);
            }
        });
        twentyPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcTheTip(0.20);
            }
        });

    }

    void calcTheTip(Double percentage){
        Double billTotal = Double.valueOf(billTotalEditView.getText().toString());
        Double tipToal = billTotal * percentage;
        tipTotalTextView.setText("Tip - $:"+ String.format("%.2f",tipToal));
        Double total = billTotal * (1+percentage);
        TotalTextView.setText("Tip - $:"+ String.format("%.2f",total));
    }
}

