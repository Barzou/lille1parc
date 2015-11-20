package com.example.flament.lille1parc.appObjects;

/** Object representation of a position
* it contains a label, which is the definition of the issue type
*/
public class Type {
    private int id;
    private String label;

    public Type(int id, String label){
        this.label = label;
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getId() {
        return id;
    }
}
