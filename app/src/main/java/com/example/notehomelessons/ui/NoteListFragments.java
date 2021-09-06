package com.example.notehomelessons.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.notehomelessons.Domain.DeviceNoteRepository;
import com.example.notehomelessons.Domain.Note;
import com.example.notehomelessons.R;

import java.util.List;

public class NoteListFragments extends Fragment implements NoteListView {

    private NotesListPresenter presenter;
    private LinearLayout container;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new NotesListPresenter(this, new DeviceNoteRepository());
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragments_note_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        presenter.reqestNotes();
        container = view.findViewById(R.id.root);
    }

    @Override
    public void showNotes(List<Note> notes) {
        for (Note note: notes){
            View notesItem = LayoutInflater.from(requireContext()).inflate(R.layout.item_note, container);
            TextView noteName = notesItem.findViewById(R.id.note_name);
            noteName.setText(note.getName());


            container.addView(noteName);


        }
    }
}
