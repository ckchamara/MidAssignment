package com.sliit;

import java.util.Scanner;

class Artist extends user {
    Scanner firstScanner = new Scanner(System.in);
    Scanner secondScanner = new Scanner(System.in);
    protected String gerne;
    protected int NoOfsongs;
    protected String[][] songList = new String[5][2];

    public Artist(String name, String email, String gerne, int NoOfsongs) {
        super(name, email);
        this.gerne = gerne;
        this.NoOfsongs = NoOfsongs;

    }

    public void storeSongs() throws ArrayIndexOutOfBoundsException {
        String rate;
        String songName;

        for (int i = 0; i <= 4; i++) {
            System.out.println("Enter Song : ");
            songName = firstScanner.nextLine();
            this.songList[i][0] = songName;
            try {
                System.out.println("Enter rate: ");
                rate = secondScanner.nextLine();
                Integer.parseInt(rate);
                this.songList[i][1] = rate;
            } catch (NumberFormatException e) {
                System.out.println(e.toString());
                System.out.println("You havent entered a number value, ");
                System.out.println("Enter Enter a number value: ");
                rate = secondScanner.nextLine();
                this.songList[i][1] = rate;
            }
        }
        System.out.println("\n\n\n");
    }

    public void DisplaySongList() {
        for (int i = 0; i <= 4; i++) {
            for (int x = 0; x <= 0; x++) {
                System.out.print(this.songList[i][x] + "   " + this.songList[i][x + 1] + "\n");
            }
        }
    }

    public void printDetails() {
        System.out.println("Artist name is : " + this.name);
        System.out.println("Artist Email is : " + this.email);
        System.out.println("Artist Music Genre is  : " + this.gerne);
        System.out.println("Number of Songs  :- " + this.NoOfsongs);
        this.DisplaySongList();
        System.out.println("\n\n\n");
    }

}
