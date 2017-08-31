package app.basics.izhang.sportsnewapp;

import android.app.LoaderManager;
import android.content.Intent;
import android.content.Loader;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import app.basics.izhang.sportsnewapp.data.News;
import app.basics.izhang.sportsnewapp.data.NewsLoader;

public class HomeView extends AppCompatActivity implements LoaderManager.LoaderCallbacks<ArrayList<News>>{

    String GUARDIAN_URL = "http://content.guardianapis.com/search?q=sports&api-key=test";
    int LOADER_ID = 101;
    ArrayList<News> newsArrayList;
    NewsAdpater mAdpater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_view);

        newsArrayList = new ArrayList<>();
        mAdpater = new NewsAdpater(this, newsArrayList);

        getLoaderManager().initLoader(LOADER_ID, null, this);

    }

    /** Initializes the UI **/
    private void showUI(){
        ListView newsList = (ListView) this.findViewById(R.id.list_news);
        newsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String url = newsArrayList.get(position).getURL();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        newsList.setAdapter(mAdpater);
    }


    @Override
    public Loader onCreateLoader(int id, Bundle args) {
        return new NewsLoader(getApplicationContext(), GUARDIAN_URL);
    }

    @Override
    public void onLoadFinished(Loader<ArrayList<News>> loader, ArrayList<News> data) {
        /** Saves the new data and refreshes the adapter **/
        newsArrayList = data;
        mAdpater.clear();
        mAdpater.addAll(newsArrayList);
        showUI();
    }

    @Override
    public void onLoaderReset(Loader loader) {
        showUI();
    }
}
