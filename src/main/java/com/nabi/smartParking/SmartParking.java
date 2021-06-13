package com.nabi.smartParking;

import java.util.Arrays;

public class SmartParking {

    private final int[] floorSpots;
    private final boolean[][][] parking;

    public SmartParking(int numFloors, int numRows, int numColumns) {

        floorSpots = new int[numFloors];
        parking = new boolean[numFloors][numRows][numColumns];
        Arrays.fill(floorSpots, +numRows * numColumns);

    }

    public void display() {
        int numfloor = 1;
        for (int floor : floorSpots) {
            if (floor > 0) System.out.println("floor" + numfloor + " is Empty");
            else System.out.println("floor" + numfloor + " is full");
            ++numfloor;
        }
    }

    public void addCarToParking(int floor) {
        if (floorSpots[floor] <= 0) {
            display();
            return;
        }
        boolean[][] floorParking = parking[floor];
        for (boolean[] row : floorParking) {
            for (int spot = 0; spot < row.length; spot++) {
                if (!row[spot]) {
                    row[spot] = true;
                    --floorSpots[floor];
                    return;
                }
            }
        }
    }

    public void removeFromParking(int floor, int row, int column) {

        parking[floor][row][column] = false;
        ++floorSpots[floor];
    }
}
