package com.pluralsight;
import java.util.ArrayList;
public class AssetManager {
    public static void main(String[] args) {
        ArrayList<Asset> myAssets = new ArrayList<>();

        myAssets.add(new House("11/08/2023", "Burke House", 360999, "42 Hobbiton Lane", 1, 4000, 324));
        myAssets.add(new House("11/08/2023", "Burke Castle", 1500000, "9 Misty Meadows Way ", 2, 9000, 412300));
        myAssets.add(new Vehicle("11/08/2023", "Noah's Car", 13810, "Honda Civic EX Special Edition", 2005, 292060));
        myAssets.add(new Vehicle("11/08/2023", "Andi's Car", 33955, "Lexus Rx300", 2001, 284042));

        for(int i = 0; i < myAssets.size(); i++) {
            System.out.println("Description: " + myAssets.get(i).getDescription() + " | Date Acquired: " + myAssets.get(i).getDateAcquired() + " | Purchase Price: " + myAssets.get(i).originalCost + " | Value: " + myAssets.get(i).getValue());
            if(myAssets.get(i) instanceof House) {
                House house = (House) myAssets.get(i);
                System.out.println("My house at " + house.getAddress());
            }
            else if(myAssets.get(i) instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) myAssets.get(i);
                System.out.println("Vehicle: " + vehicle.getMakeModel() + " " + vehicle.getYear());
            }
        }
    }



}


