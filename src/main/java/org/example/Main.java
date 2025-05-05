package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(shouldWakeUp(true,-1));
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(area(-1.0, 4.0));
        System.out.println(area(5));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if(!(clock>23 || clock<0)) {
            if (clock > 20 || clock < 8) {
                return isBarking;
            }
        }
            return false;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {

        if((firstAge<=19 && firstAge>=13) || (secondAge<=19 && secondAge>=13) || (thirdAge<=19 && thirdAge>=13)){
            return true;
        }
        return false;
    }
    public static boolean isCatPlaying(boolean isSummer, int temp) {

        if(isSummer && (temp>=25 && temp<=45)){
            return true;
        }else if(!isSummer&& (temp>=25 && temp<=35)){
            return true;
        }else{
            return false;
        }
    }
    public static double area(double width, double height) {
        if(width>0 && height>0){
            return width*height;
        }
        return -1;
    }
    public static double area(double radius) {
        if(radius>0){
            return radius*radius*Math.PI;
        }
        return -1;
    }


}
