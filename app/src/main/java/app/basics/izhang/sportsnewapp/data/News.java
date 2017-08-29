package app.basics.izhang.sportsnewapp.data;

import java.util.Date;

/**
 * Created by ivanzhang on 8/28/17.
 */

public class News {
    private String title;
    private String section;
    private String type;
    private Date date;
    private String author;
    private String URL;

    public News(String title, String section, String type, Date date, String author, String URL){
        this.title = title;
        this.section = section;
        this.type = type;
        this.date = date;
        this.author = author;
        this.URL = URL;
    }


    public String getTitle() {
        return title;
    }


    public String getSection() {
        return section;
    }


    public String getType() {
        return type;
    }

    public Date getDate() {
        return date;
    }


    public String getAuthor() {
        return author;
    }


    public String getURL() {
        return URL;
    }


    @Override
    public String toString(){
        String str = "Title: " + this.title + "\n" +
                "Section: " + this.section + "\n" +
                "Type: " + this.type + "\n" +
                "Date: " + this.date.toString() + "\n" +
                "Author: " + this.author + "\n" +
                "URL: " + this.URL + "\n" ;

        return str;
    }
}
