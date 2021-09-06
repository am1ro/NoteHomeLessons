package com.example.notehomelessons.Domain;

import androidx.annotation.StringRes;

public class Note {

    @StringRes
    private int name;

    @StringRes
    private int descriptionNote;

    @StringRes
    private int dateCreate;

    public Note(int name, int descriptionNote, int dateCreate) {
        this.name = name;
        this.descriptionNote = descriptionNote;
        this.dateCreate = dateCreate;
    }

    public Note(int name, int name1) {

    }

    public int getName() {
        return name;
    }

    public int getDescriptionNote() {
        return descriptionNote;
    }

    public int getDateCreate() {
        return dateCreate;
    }
}

