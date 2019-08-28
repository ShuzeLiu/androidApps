package shuzeliu.com.example.computerscienceamonguniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class UniversityDetail extends AppCompatActivity {

    TextView nameTextView;
    TextView rankingTextView;
    TextView csrankingTextView;
    TextView areaTextView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university_detail);

        nameTextView = (TextView) findViewById(R.id.nameTextView);
        rankingTextView = (TextView) findViewById(R.id.rankingTextView);
        csrankingTextView = (TextView) findViewById(R.id.csrankingTextView);
        areaTextView = (TextView) findViewById(R.id.areaTextView);
        imageView = (ImageView) findViewById(R.id.imageView);

        String universityName = (String) getIntent().getExtras().get("universityName");
        nameTextView.setText(universityName);

        if (universityName.equals( "Princeton")){
            rankingTextView.setText("Ranking: 1");
            imageView.setImageResource(R.mipmap.princeton);
        }
        if (universityName .equals( "Harvard")){
            rankingTextView.setText("Ranking: 2");
            imageView.setImageResource(R.mipmap.harvard);
        }
        if (universityName .equals( "Yale")){
            rankingTextView.setText("Ranking: 3");
            imageView.setImageResource(R.mipmap.yale);

        }
        if (universityName .equals( "Stanford")){
            rankingTextView.setText("Ranking: 7");
            imageView.setImageResource(R.mipmap.stanford);
        }



    }
}
