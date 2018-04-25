package com.example.rachael.treeapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class reeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree);

        TreeList treeArray = new TreeList();
        ArrayList<Tree> treeList = treeArray.getTreeList();

        TreeListAdapter treeListAdapter = new TreeListAdapter(this, treeList);

        ListView treeListView = findViewById(R.id.treeListId);

        treeListView.setAdapter(treeListAdapter);
    }

    public void onListItemClick(View listItem){


        Tree tree = (Tree) listItem.getTag();

        Intent intent = new Intent(this, TreeDetailActivity.class);
        intent.putExtra("tree", tree);
        startActivity(intent);
    }
}
