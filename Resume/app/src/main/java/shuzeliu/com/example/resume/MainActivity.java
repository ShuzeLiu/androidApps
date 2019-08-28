package shuzeliu.com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button workHistoryButton;
    Button callButoon;
    Button emailButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        workHistoryButton = (Button) findViewById(R.id.workHistory);
        callButoon = (Button) findViewById(R.id.Call);
        emailButton = (Button) findViewById(R.id.Email);


        workHistoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToTheOtherActivity = new Intent(getApplicationContext(),WorkHistory.class);
                startActivity(goToTheOtherActivity);
            }
        });

        callButoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri myPhoneNumbwe = Uri.parse("tel:5183605086");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, myPhoneNumbwe);
                startActivity(callIntent);
            }
        });

        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("plain/test");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"shuzeliu97@gmail.com"});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Shuze's Resume");

                startActivity(emailIntent);
            }
        });


    }


}
