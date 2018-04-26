package com.clouway.crm.core.Tree;

public class HetTreeElement<T> {

    static int elemCount = 0;

    T node;
    HetTreeElement left;
    HetTreeElement right;
    int index;
    boolean isFull = false;

    public HetTreeElement(T object){
        this.node = object;
        this.index = elemCount;
        elemCount++;
    }

    public boolean addElem (Object object){
        if(left == null){
            this.left = new HetTreeElement(object);
            return false;
        }
        else if(right == null){
            this.right = new HetTreeElement(object);
            this.isFull = true;
            return true;
        }
        return true;
    }

}
