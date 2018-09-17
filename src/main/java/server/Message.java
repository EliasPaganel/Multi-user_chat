package server;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable{
    String author;
    String text;
    Date time;

    public Message() {
        author = null;
        text = null;
        time = null;
    }

    public Message(String author, String text, Date time) {
        this.author = author;
        this.text = text;
        this.time = time;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
