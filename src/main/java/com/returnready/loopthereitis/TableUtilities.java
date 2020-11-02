
package com.returnready.loopthereitis;
import java.util.Arrays;

public class TableUtilities {
   public static String getSmallMultiplicationTable() {
       String returnedTable ="";
       int tableSize = 5;
       for (int i = 1; i <= tableSize; i++) {
           for(int j = 1; j <= tableSize; j++) {
               if (j == tableSize) {
                   returnedTable += String.format("%3d |\n", j * i);
               } else returnedTable += String.format("%3d |", j * i);
           }
       }

       return returnedTable;
   }
   public static String getLargeMultiplicationTable() {
       String returnedTable ="";
       int tableSize = 10;
       for (int i = 1; i <= tableSize; i++) {
           for(int j = 1; j <= tableSize; j++) {
               if (j == tableSize) {
                   returnedTable += String.format("%3d |\n", j * i);
               } else returnedTable += String.format("%3d |", j * i);
           }
       }

       return returnedTable;
   }

    public static String getMultiplicationTable(int tableSize) {
        String returnedTable ="";
        for (int i = 1; i <= tableSize; i++) {
            for(int j = 1; j <= tableSize; j++) {
                if (j == tableSize) {
                    returnedTable += String.format("%3d |\n", j * i);
                } else returnedTable += String.format("%3d |", j * i);
            }
        }

        return returnedTable;

    }

}

