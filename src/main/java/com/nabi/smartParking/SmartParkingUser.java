package com.nabi.smartParking;

import java.util.Scanner;

public class SmartParkingUser {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please input the number of floors.");
        int floors = input.nextInt();

        System.out.println("Please input the number of rows.");
        int rows = input.nextInt();

        System.out.println("Please input the number of columns.");
        int columns = input.nextInt();

        SmartParking parking = new SmartParking(floors,rows,columns);

      System.out.println("Parking initial status ");
        parking.display();

        for(int i = 0; i < floors; i++){
            for(int j = 0; j < rows; j++){
                for(int k = 0; k < columns; k++){
                    parking.addCarToParking(i);
//                    System.out.println("Parked car in " + "floor:" + i + " row:" + j + " Column:" + k );
                }
            }
        }
      System.out.println("Parking status after filling the parking");
      parking.display();

        parking.removeFromParking(0, 1, 1);
       System.out.println("Parking status after removing one car from 1 floor");
      parking.display();
        parking.addCarToParking(0);
        System.out.println("Parking status after adding one car from 1 floor");
        parking.display();
    }

}
