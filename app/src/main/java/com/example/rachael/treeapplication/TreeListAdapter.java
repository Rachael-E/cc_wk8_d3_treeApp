package com.example.rachael.treeapplication;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TreeListAdapter extends ArrayAdapter<Tree> {

    public TreeListAdapter(Context context, ArrayList<Tree> trees){
        super(context, 0, trees);
    }


    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.trees_item, parent, false);
        }

        Tree currentTree = getItem(position);

        TextView treeNameTextView = listItemView.findViewById(R.id.treeNameTextViewId);
        treeNameTextView.setText(currentTree.getTreetype());

        TextView treeAgeTextView = listItemView.findViewById(R.id.treeAgeTextViewId);
        treeAgeTextView.setText(currentTree.getTreeAge().toString()); // how to add ' years old' using Android resource? And how to add images?

        listItemView.setTag(currentTree);

        return listItemView;
    }
}
