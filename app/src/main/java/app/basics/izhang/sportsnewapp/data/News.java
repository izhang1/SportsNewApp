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

    public News(String title, String section, String type, Date date, String author){
        this.title = title;
        this.section = section;
        this.type = type;
        this.date = date;
        this.author = author;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
