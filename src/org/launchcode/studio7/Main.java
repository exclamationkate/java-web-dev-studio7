package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD myPlaylist = new CD("Favorite Songs",700);
        DVD homeVideo = new DVD("First Recital", 9000);

        // Testing CD
        System.out.println(myPlaylist.loadDisc());
        myPlaylist.spinDisc();

        myPlaylist.storeData("Billie Eilish - Ocean Eyes");
        myPlaylist.storeData("Beauvois - Echo");

        System.out.println(myPlaylist.displayInfo());
        System.out.println(myPlaylist.playContents());

        myPlaylist.deleteAllData();

        System.out.println(myPlaylist.displayInfo());

        // Testing DVD
        System.out.println("\n*******\n");
        System.out.println(homeVideo.loadDisc());
        homeVideo.spinDisc();

        homeVideo.storeData("Claire de Lune - Piano");
        homeVideo.storeData("Awards Ceremony");

        System.out.println(homeVideo.displayInfo());
        System.out.println(homeVideo.playContents());

        homeVideo.deleteAllData();

        System.out.println(homeVideo.displayInfo());
    }
}
