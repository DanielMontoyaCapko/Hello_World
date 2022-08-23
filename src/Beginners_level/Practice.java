package Beginners_level;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Practice {
    public static void main1(String[] args) {
        int myAge = 20;
        int merysAge = myAge + 6;
        System.out.println(merysAge);
    }

    //Date
    public static void main2(String[] args) {
        Date now = new Date();
        System.out.println(now);
    }

    //Points
    public static void main3(String[] args) {
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
    }

    //Strings 1
    public static void main4(String[] args){
        String message = "Hello World" + ". Welcome to my new world";
        System.out.println(message);
        System.out.println(message.endsWith("world"));
        System.out.println(message.startsWith("world"));
        System.out.println(message.length());
        System.out.println(message.indexOf("w"));
        System.out.println(message.replace("World", "Fellas"));
        System.out.println(message.toLowerCase());
    }

    //Strings 2
    public static void main6(String[] args){
        String message = "Hello \nDaniel"; // use \ to make the code escape
        System.out.println(message);
    }

    //Arrays
    public static void main7(String[] args){
         int[] numbers = {2,5,6,1,4};
         System.out.println(numbers.length);
         System.out.println(Arrays.toString(numbers));
         Arrays.sort(numbers);
         System.out.println(Arrays.toString(numbers));
    }

    //Multi-Dimensional Arrays
    public static void main8(String[] args){
        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));

        int [][] numbers2 = {{1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepToString(numbers2));
    }

    //Constant
    public static void main9(String[] args){
        float PI = 3.14F;
        double radius = 2.5;
        double areaOfCircle = 2 * PI * radius * radius;
        System.out.println(areaOfCircle);
    }

    //Arithmetic Expressions 1
    public static void main10(String[] args){
        int sum = 4 + 5;
        int sub = 6 - 5;
        int mult = 5 * 3;
        double div = (double) 10/ (double) 3;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);
    }

    //Arithmetic Expressions 2
    public static void main11(String[] args){
        int x = 1;
        x += 2;
        System.out.println(x);
    }

    //Order of Operations
    public static void main12(String[] args){
        int x = 10 + 3 * 2;
        System.out.println(x);
    }

    //Casting
    public static void main13(String[] args){
        short x = 1;
        int y = x + 2;
        System.out.println(y);
        //Implicit Casting
        // byte > short > int > long > float > double
        double a = 1.1;
        int b = (int) a + 2;
        System.out.println(b);
        // Wraper class
        String number = "1";
        int Wraper_Sum = Integer.parseInt(number) + 2; //From String to Int
        System.out.println(Wraper_Sum);
    }

    //Math Class
    public static void main14(String[] args){
        int round = Math.round(1.1F);
        System.out.println(round);
        int ceil = (int)Math.ceil(1.1F); //Truncar
        System.out.println(ceil);
        int  max = Math.max(1,2); //return greater num
        System.out.println(max);
        double random = Math.random();
        System.out.println(random);
        int roundRandom = (int)Math.round(Math.random() * 100);
        System.out.println(roundRandom);
    }

    //Formatting Values
    public static void main15(String[] args){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);

        String resultPercent = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(resultPercent);
    }

    //Reading Input
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please provide an age: ");
        byte age = scanner.nextByte();
        System.out.println("You are " + age);

        System.out.print("Please provide your name: ");
        String name = scanner.next().trim();
        System.out.println("Welcome to IJ " + name);
    }
}


