package com.company;

public class Main {

    public static void main(String[] args) {
        int temp = 0, days = -1, non = 0, finaldistance = 0;
        int firsttemp = (int)(Math.random() * (105 - 1 + 1))+1;
        System.out.println("the first temp is " + firsttemp);
        if(firsttemp <= 100) {
            while (temp <= 100) {
                temp = (int) (Math.random() * (105 - 1 + 1)) + 1;
                System.out.println(temp);
                days++;
                if (temp == firsttemp) {
                    int distance = days;
                    days = -1;
                    non = 1;
                    if (finaldistance < distance)
                        finaldistance = distance;
                }
            }
        }
        else
            System.out.println(firsttemp);

        if(non == 0)
            System.out.println(-1);

        System.out.println("the distance between the first temp to the same temp with the maximum distance is " + finaldistance);
    }
}
