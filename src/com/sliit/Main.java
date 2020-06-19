package com.sliit;

class Main {
    public static void main(String[] args) {
        Operators operators = new Operators("Simon", "Simon@playsong.com", 123, "accountant");
        Artist artist = new Artist("Pablo Albo", "pablo@gmail.com", "pop", 5);
        artist.storeSongs();
        artist.printDetails();
        operators.printDetails();
        operators.calculateRevenue(artist);
    }
}
