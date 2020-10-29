package com.example.lnt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.lnt.model.Note;
import com.example.lnt.adopter.NotesAdapter;

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
//        notesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        notesRecyclerView.setLayoutManager(new GridLayoutManager(this,2));

        Button contextButton = findViewById(R.id.buttoncontext);
        registerForContextMenu(contextButton);
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
    @Override // to show the menu
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.recycler_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case R.id.selectall:
                Toast.makeText(this, "selecting all", Toast.LENGTH_SHORT).show();
                break;
            case R.id.paste:
                Toast.makeText(this, "pasting all", Toast.LENGTH_SHORT).show();

                break;
        }
        return true;
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.list_item_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        super.onContextItemSelected(item);
        switch (item.getItemId()){
            case R.id.delete:
                Toast.makeText(this, "deleting", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}