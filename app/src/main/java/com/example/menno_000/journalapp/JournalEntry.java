package com.example.menno_000.journalapp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JournalEntry implements java.io.Serializable {
    private int id;
    private String title;
    private String content;
    private String mood;
    private Date timestamp;

    public JournalEntry(int id, String title, String content, String mood) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.mood = mood;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getMood() {
        return mood;
    }

    public String getTimestamp() {
        return simpleDateFormat.format(timestamp);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    SimpleDateFormat simpleDateFormat =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
}
