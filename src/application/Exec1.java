package application;


import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;



public class Exec1 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter the values: ");
        System.out.print("Enter the width: ");
        rectangle.width = sc.nextDouble();

        System.out.print("Enter the height: ");
        rectangle.height = sc.nextDouble();

        rectangle.area();
        rectangle.perimeter();
        rectangle.diagonal();


        sc.close();


    }
}
