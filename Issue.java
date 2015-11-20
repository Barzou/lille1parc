package com.example.flament.lille1parc.appObjects;

/**
 * Object representation of an issue
 * it contains all information about an issue : description, position and type
 */
public class Issue {
    private int id;
    private String label; // issue description
    private Position position; // issue position
    private Type type; // issue type

    public Issue(int id, String label, Position position, Type type) {
        this.id = id;
        this.label = label;
        this.position = position;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
