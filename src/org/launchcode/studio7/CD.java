package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {
    private static String discType = "CD";

    public CD(String name, int capacity) {
        super(name, capacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("CD is spinning at a rate of 200 - 500 RPM.");
    }

    public String getDiscType() {
        return discType;
    }

    @Override
    public String displayInfo() {
        if (isLoaded()) {
            return "Name: " + this.getName() + "\nType: " + this.getDiscType() + "\nCapacity (MB): " + this.getCapacityMB() + "\nContents:\n" + this.getData();
        } else {
            return "Please load disc.";
        }
    }
}
