package com.example.notehomelessons.ui;

import com.example.notehomelessons.Domain.Note;
import com.example.notehomelessons.Domain.NoteRepository;

import java.util.List;

public class NotesListPresenter {
    private final NoteListView view;
    private final NoteRepository repository;

    public NotesListPresenter(NoteListView view, NoteRepository repository) {
        this.view = view;
        this.repository = repository;
    }

    public void reqestNotes(){
        List<Note> result = repository.getNote();
        view.showNotes(result);
    }
}
