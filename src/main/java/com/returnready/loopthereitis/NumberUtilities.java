package com.returnready.loopthereitis;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String returnedRange="";
        for(int currentNumberInRange = (start %2==0)?start:start+1; currentNumberInRange < stop;
            currentNumberInRange+=2){
            returnedRange = returnedRange + currentNumberInRange;
        }
        return returnedRange;
    }


    public static String getOddNumbers(int start, int stop) {

        String returnedRange="";
        for(int currentNumberInRange = (start %2!=0)?start:start+1; currentNumberInRange < stop;
            currentNumberInRange+=2){
            returnedRange = returnedRange + currentNumberInRange;
        }
        return returnedRange;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String returnedRange="";
        for(int currentNumberInRange = start; currentNumberInRange< stop;
            currentNumberInRange=currentNumberInRange + step) {
            returnedRange = returnedRange + currentNumberInRange * currentNumberInRange;
        }
        return returnedRange;
    }

    public static String getRange(int stop) {
        String returnedRange = "";
        for(int currentNumberInRange = 0; currentNumberInRange < stop; currentNumberInRange++){
            returnedRange = returnedRange + currentNumberInRange;
        }
        return returnedRange;
    }

    public static String getRange(int start, int stop) {
        String returnedRange="";
        for(int currentNumberInRange = start; currentNumberInRange< stop; currentNumberInRange++){
            returnedRange = returnedRange + currentNumberInRange;
        }
        return returnedRange;
         }


    public static String getRange(int start, int stop, int step) {
        String returnedRange="";
        for(int currentNumberInRange = start; currentNumberInRange< stop;
          currentNumberInRange=currentNumberInRange + step) {
            returnedRange = returnedRange + currentNumberInRange;
        }
        return returnedRange;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String returnedRange="";
        for(int currentNumberInRange = start; currentNumberInRange< stop;
            currentNumberInRange=currentNumberInRange + step) {
            returnedRange = returnedRange + (int) (Math.pow(currentNumberInRange, exponent));
        }
        return returnedRange;
    }
}
