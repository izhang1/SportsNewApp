package app.basics.izhang.sportsnewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class HomeView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_view);

        showUI();
    }

    private void showUI(){
        ListView newsList = (ListView) this.findViewById(R.id.list_news);


    }
}
