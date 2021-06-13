package com.nabi.smartParking;

import java.util.Scanner;

public class SmartParkingUser {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please input the number of floors.");
        int floors = input.nextInt();

        System.out.println("Please input the number of rows.");
        int rows = input.nextInt();

        System.out.println("Please input the number of columns.");
        int columns = input.nextInt();

        SmartParking parking = new SmartParking(floors, rows, columns);

        parking.display();
        //reploace it with for loop for rows and columns
        parking.addCarToParking(0);
        parking.addCarToParking(0);
        parking.addCarToParking(0);
        parking.addCarToParking(0);

        parking.display();

        parking.addCarToParking(1);
        parking.addCarToParking(1);
        parking.addCarToParking(1);
        parking.addCarToParking(1);

        parking.display();
    }
}
