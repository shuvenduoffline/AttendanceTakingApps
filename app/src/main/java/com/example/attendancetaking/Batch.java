package com.example.attendancetaking;

public class Batch {
    private String name;
    private int startyr;
    private int endyr;
    private String id;

    public Batch(String name, int startyr, int endyr, String id) {
        this.name = name;
        this.startyr = startyr;
        this.endyr = endyr;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getStartyr() {
        return startyr;
    }

    public int getEndyr() {
        return endyr;
    }

    public String getId() {
        return id;
    }
}
