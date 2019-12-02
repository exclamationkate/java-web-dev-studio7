package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {
    private static String discType = "DVD";

    public DVD(String name, int capacity) {
        super(name, capacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("DVD is spinning at a rate of 570 - 1600 RPM.");
    }

    public static String getDiscType() {
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
