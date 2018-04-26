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

        String treeAge = currentTree.getTreeAge().toString();
        String treeAgeInYears = "This tree is " + treeAge + " " + getContext().getString(R.string.tree_age);
        treeAgeTextView.setText(treeAgeInYears);
        
        // how to add images?

        // this is where the tree list image should live?

        listItemView.setTag(currentTree);

        return listItemView;
    }
}
