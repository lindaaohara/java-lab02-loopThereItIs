package com.returnready.loopthereitis;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String star = "";
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j <= i; j++) {
                 star += "*";
            }
            star += "\n";
        }
        return star;
    }

        public static String getRow(int width){
            String star = "*";
            String repeatedStar = "";
            for (int i = 0; i < width; i++) {
                repeatedStar = repeatedStar + star;
            }
            return repeatedStar;
        }

        public static String getSmallTriangle () {
            String star = "";
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j <= i; j++) {
                    star += "*";
                }
                star += "\n";
            }
            return star;
        }

        public static String getLargeTriangle () {
            String star = "";
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j <= i; j++) {
                    star += "*";
                }
                star += "\n";
            }
            return star;
        }
}
