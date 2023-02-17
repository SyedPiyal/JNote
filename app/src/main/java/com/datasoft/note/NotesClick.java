package com.datasoft.note;

import androidx.cardview.widget.CardView;

import com.datasoft.note.Models.Notes;

public interface NotesClick {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
