package app.basics.izhang.sportsnewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.List;

import app.basics.izhang.sportsnewapp.data.News;

/**
 * Created by ivanzhang on 8/29/17.
 */

public class NewsAdpater extends ArrayAdapter<News> {

    public NewsAdpater(Context context, List<News> earthquake){
        super(context, 0, earthquake);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_item, parent, false);
        }

        News currentNews = getItem(position);

        // Setup UI and initialize
        TextView titleView = (TextView) listItemView.findViewById(R.id.tv_title);
        TextView sectionView = (TextView) listItemView.findViewById(R.id.tv_section);
        TextView typeView = (TextView) listItemView.findViewById(R.id.tv_type);
        TextView dateView = (TextView) listItemView.findViewById(R.id.tv_date);
        TextView authorView = (TextView) listItemView.findViewById(R.id.tv_author);

        // Setting the value from News object
        titleView.setText(currentNews.getTitle());
        sectionView.setText(currentNews.getSection());
        typeView.setText(currentNews.getType());
        dateView.setText(currentNews.getDate().toString());
        authorView.setText(currentNews.getAuthor());

        return listItemView;
    }
}
