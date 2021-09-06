package com.example.notehomelessons.Domain;

import com.example.notehomelessons.R;

import java.util.ArrayList;

public class DeviceNoteRepository implements NoteRepository {
    @Override
    public ArrayList<Note> getNote() {

        ArrayList<Note> note = new ArrayList<>();

        note.add(new Note(R.string.name, R.string.name ));
        note.add(new Note(R.string.descriptionNote, R.string.descriptionNote ));
        note.add(new Note(R.string.dateCreate, R.string.dateCreate ));

        return note;
    }
}
