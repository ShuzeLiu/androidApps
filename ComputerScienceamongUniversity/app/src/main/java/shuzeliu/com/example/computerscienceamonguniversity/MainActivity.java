package shuzeliu.com.example.computerscienceamonguniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] university = new String[] {"Princeton","Harvard","MIT","Stanford","Yale","Columbia","Cornell","Chicago","Duke","Upenn","JHU","Northwestern","Cal","Dartmouth"};
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> universityAdapter = new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_list_item_1,university);
        listView.setAdapter(universityAdapter);

        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        System.out.println(("Tapped:"+ i));
        Intent moveToDetailIntent = new Intent(getBaseContext(), UniversityDetail.class);
        moveToDetailIntent.putExtra("universityName",university[i]);

        startActivity(moveToDetailIntent);
    }
}
