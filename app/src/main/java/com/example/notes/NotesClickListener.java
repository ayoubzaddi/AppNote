package com.example.notes;

import androidx.cardview.widget.CardView;

import com.example.notes.Modales.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
