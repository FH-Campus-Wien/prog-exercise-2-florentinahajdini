package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1

    public void largestNumber() {
        Scanner scanner = new Scanner(System.in);
        double max = 0, number = 1;
        int i = 1;
        while (number > 0) {
            System.out.print("Number " + i + ": ");
            number = scanner.nextDouble();
            if (i == 1 && number <= 0) {
            System.out.println("No number entered.");
        } else{
            if (number > max) {
                max = number;
            }
            i++;
        }
        }if (i >= 2) {
        System.out.println("The largest number is " + String.format("%.2f", max));}

    }

    //todo Task 2
    public void stairs() {
        int numberRow, k = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        numberRow = sc.nextInt();

        if(numberRow <= 0) {
            System.out.println("Invalid number!");
        }else {

            for (int i = 1; i <= numberRow; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(k + " ");
                    k++;
                }
                System.out.println();
            }
        }
    }



    //todo Task 3
    public void printPyramid(){
        // input your solution here
        int numberRow = 6, a = 0;

        for(int i = 1; i<= 6; i++, a = 0){
            for(int j = 1; j<=numberRow - i; j++){
                System.out.print("  ");
            }
            while (a != 2 * i -1){
                System.out.print("* ");
                a++;
            }System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
        Scanner input = new Scanner(System.in);
        System.out.print("h: ");
        int h = input.nextInt();
        System.out.print("c: ");
        char c = input.next().charAt(0);

        if (h % 2 == 0){
            System.out.println("Invalid input");
        }else
            for( int i= 0; i <= h / 2; i++){
                for( int j= i; j < h / 2; j++){
                    System.out.print(" ");
                }
                for (int numberOne= - i; numberOne <= 1; numberOne++){
                    System.out.print((char)(c - Math.abs(numberOne)));
                }
                System.out.println();
            }
            for( int i = h /2; i > 0; i--){
                for(int j = i; 1<= h / 2; j++){
                    System.out.print(" ");
                }
                for(int numberOne= 0 - i; numberOne < i; numberOne++){
                    System.out.print((char)(c- Math.abs(numberOne)));
                }
                System.out.println();
            } // klappt nicht :)

        }



    //todo Task 5
    public void marks(){
        // input your solution here
        Scanner input = new Scanner(System.in);
        int max = 0, grade = 1;
        int i = 1;

        while (grade > 0)
        System.out.println("Mark "+i + ": ");
        grade = input.nextInt();
        if (i <= 0 && i >= 6){
            System.out.println("Invalid mark!");
        }else {
            if(grade > max){
                max = grade;
            }
        }

    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here

    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}