package com.example.rachael.treeapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TreeDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree_detail);

        Intent intent = getIntent();
        Tree tree = (Tree) intent.getSerializableExtra("tree");

        TextView treeNameTextView = findViewById(R.id.treeNameTextViewId);
        treeNameTextView.setText(tree.getDescription());
    }
}
