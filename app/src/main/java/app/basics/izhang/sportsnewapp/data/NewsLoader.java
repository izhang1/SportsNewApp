package app.basics.izhang.sportsnewapp.data;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.ArrayList;

/**
 * Created by ivanzhang on 8/29/17.
 */

public class NewsLoader extends AsyncTaskLoader<ArrayList<News>> {

    String URL;

    public NewsLoader(Context context, String URL) {
        super(context);
        this.URL = URL;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public ArrayList<News> loadInBackground() {
        ArrayList newsList = QueryUtils.fetchNewsData(URL);

        return newsList;
    }
}
