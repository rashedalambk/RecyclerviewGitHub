package com.example.windcore.recyclerviewpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.windcore.recyclerviewpractice.adapter.RvAdapter;
import com.example.windcore.recyclerviewpractice.model.Message;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RvAdapter adapter;
    private List<Message> messageList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.rv_main);

        //TODO (8) Add a Layout Manager to the RV, you could use one by android or create your own.
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        messageList = new ArrayList<>();
        for (int i = 0; i<100; i++){
            Message message = new Message("Title", "Body ");
            messageList.add(message);
        }

        //Init adapter and set adapter
        adapter = new RvAdapter(this, messageList);
        recyclerView.setAdapter(adapter);

    }
}
