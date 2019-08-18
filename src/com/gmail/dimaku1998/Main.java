/*4) Выведите на экран прямоугольник из *. Причем высота и ширина
прямоугольника вводятся с клавиатуры. Например ниже представлен
прямоугольник с высотой 4 и шириной 5.
*****
*   *
*   *
*****
* */
package com.gmail.dimaku1998;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height = ");
        byte height = sc.nextByte();
        System.out.print(" Enter width = ");
        byte width = sc.nextByte();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i > 0 && j > 0 && i < height - 1 && j < width-1)){
                    System.out.print(" ");
                }else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
