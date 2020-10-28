package com.example.lnt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.lnt.override.NotesAdapter;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

    ArrayList<Note> noteArrayList;//declaration

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        noteArrayList = new ArrayList<>(); //initialization

        createData();
        NotesAdapter adapter = new NotesAdapter(this, noteArrayList);
        RecyclerView notesRecyclerView = findViewById(R.id.notes_recyclerview);
        notesRecyclerView.setAdapter(adapter);
        notesRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }


    private void createData() {
        noteArrayList.add(new Note("title1","subtitle1"));
        noteArrayList.add(new Note("title2","subtitle2"));
        noteArrayList.add(new Note("title3","subtitle3"));
        noteArrayList.add(new Note("title4","subtitle4"));
        noteArrayList.add(new Note("title5","subtitle5"));
        noteArrayList.add(new Note("title6","subtitle6"));
        noteArrayList.add(new Note("title7","subtitle7"));
        noteArrayList.add(new Note("title8","subtitle8"));

    }
}