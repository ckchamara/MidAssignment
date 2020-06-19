package com.sliit;

import java.util.Scanner;

class Operators extends user implements Calculations {
    Scanner scanner = new Scanner(System.in);
    protected int empNo;
    protected String desig;

    public Operators(String name, String email, int empNo, String desig) {
        super(name, email);
        this.desig = desig;
        this.empNo = empNo;
    }

    public void printDetails() {
        System.out.println("Operator name  : " + this.name);
        System.out.println("Operator Employee number  : " + this.empNo);
        System.out.println("Operator Designation  : " + this.desig);
        System.out.println("Operator Email  : " + this.email);
        System.out.println("\n\n\n");

    }

    public void calculateRevenue(Artist artist) throws ArrayIndexOutOfBoundsException {
        int Downloads;
        System.out.println("Enter No of downloads :");
        Downloads = scanner.nextInt();
        double revenue,average = 0;
        String temp;
        for (int i = 0; i <= 4; i++) {
            for (int x = 0; x <= 0; x++) {
                temp = artist.songList[i][x + 1];
                average = average + Integer.parseInt(temp);
            }
        }

        average = average / 5;
        revenue = average * Downloads;
        System.out.println("Artist : " + artist.name);
        System.out.println("Revenue is Rs " + revenue);
    }

}
