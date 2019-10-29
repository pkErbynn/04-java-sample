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
        if((a > 0) && (a % 2 == 0)){
            return true;
        }
        else return false;
    }

    public static boolean isALeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 4 == 0) {
                    System.out.println("leap year...yaaye\n");
                    return true;
                } else {
                    System.out.println("not leap year...sheesh");
                    return false;
                }
            } else {
                System.out.println("leap year...tadaa");
                return false;
            }
        } else {
            System.out.println("not leap year...yikes! :(");
            return false;
        }
    }



}
