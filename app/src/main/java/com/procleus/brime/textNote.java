package com.procleus.brime;

import java.sql.Timestamp;

/**
 * Created by mudit on 08/07/2016.
 */
public class TextNote {
    public int id;
    public String note;
    public String title;
    public Timestamp created;
    public Timestamp edited;
    public int owner;

    public TextNote(int i, String n, String t, Timestamp c, Timestamp e, int o) {
        this.id = i;
        this.note = n;
        this.title = t;
        this.created = c;
        this.edited = e;
        this.owner = o;
    }
}
