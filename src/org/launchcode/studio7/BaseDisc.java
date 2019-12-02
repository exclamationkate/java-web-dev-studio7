package org.launchcode.studio7;

public abstract class BaseDisc {
    private String name;
    private int capacityMB;
    private String data = "";
    private boolean isLoaded = false;

    // Constructor

    public BaseDisc(String name, int capacityMB) {
        this.name = name;
        this.capacityMB = capacityMB;
    }

    // Custom Methods

    public void storeData(String newData) {
        this.data += newData + "\n";
    }

    public void deleteAllData() {
        this.data = "";
    }

    public String loadDisc() {
        this.isLoaded = true;
        return "Disc loaded";
    }


    public String playContents() {
        return "Contents playing.";
    }

    // Getters and Setters

    public String getData() {
        if (data == "") {
            return "Disc empty";
        } else {
            return data;
        }
    }

    public String getName() {
        return name;
    }

    public int getCapacityMB() {
        return capacityMB;
    }

    public boolean isLoaded() {
        return isLoaded;
    }
}
