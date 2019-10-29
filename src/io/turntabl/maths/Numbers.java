package io.turntabl.maths;

public class Numbers {

    public static int sum(int a, int b){
        int result = a + b;
        return result;
    }

    public static boolean isPositive(int a){
        if(a > 0){
            return true;
        }
        return false;

    }

    public static boolean isNegative(int a){
        if(a < 0){
            return true;
        }
        else return false;
    }

    public static boolean isEvenAndGreaterThanZero(int a){
        if( (a > 0) && (a % 2 == 0)){
            return true;
        }
        else return false;
    }




}
