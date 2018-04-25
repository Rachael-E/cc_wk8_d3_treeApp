package com.example.rachael.treeapplication;

import java.util.ArrayList;

public class TreeList {

    private ArrayList<Tree> treeList;

    public TreeList(){
        treeList = new ArrayList<Tree>();
        treeList.add(new Tree("Beech", 100, "Often mistaken for a Beach Tree, this tree would not be found along sandy shorelines"));
        treeList.add(new Tree("Oak", 250, "There are none wiser than the revered Oak tree"));
        treeList.add(new Tree("Birch", 75, "The slender Birch quivers delightfully in the wind"));
        treeList.add(new Tree("Rowan", 50, "The rugged Rowan rests on ravines and rocky cliffs"));
        treeList.add(new Tree("Ash", 60, "Last to leaf, last to fall"));
        treeList.add(new Tree("Fir", 20, "Infamous for dropping needles on calm muted forest floors"));
        treeList.add(new Tree("Sycamore", 120, "The delight of many children when its helicopter seeds whirl down from on high"));
    }

    public ArrayList<Tree> getTreeList() {
        return treeList;
    }
}
