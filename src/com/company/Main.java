package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(generaetRandomAge());
        System.out.println(walking(generaetRandomAge(),15));
        System.out.println(walking(30,15));
        System.out.println(walking(30,15));
        System.out.println(walking(30,15));
        System.out.println(walking(30,15));

    }

    public static String walking(int age, int tem) {
        if ((age > 20 && age < 45) && tem > -20 && tem < 30) {
            return "можно итди гулять";

        } else if (age > 20 && tem > 0 && tem < 28) {
            return "можно итди гулять";

        } else if (age > 45 && tem > -10 && tem < 25) {
            return "можно итди гулять";

        } else {
            return "сиди дома";

        }
    }
    public static int generaetRandomAge(){
        Random random = new Random();
        int age = random.nextInt(50);
        return age;
    }
}
