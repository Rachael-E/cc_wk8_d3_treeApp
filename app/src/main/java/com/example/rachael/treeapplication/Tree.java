package com.example.rachael.treeapplication;

import java.io.Serializable;
import java.util.ArrayList;

public class Tree implements Serializable {

    private String treetype;
    private Integer treeAge;
    private String description;

    public Tree(String treetype, Integer treeAge, String description){
        this.treetype = treetype;
        this.treeAge = treeAge;
        this.description = description;
    }

    public String getTreetype() {
        return treetype;
    }

    public Integer getTreeAge() {
        return treeAge;
    }

    public String getDescription() {
        return description;
    }
}
