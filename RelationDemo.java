/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.relationdemo;

/**
 *
 * @author LAB07
 */
public class RelationDemo {

    public static void main(String[] args) {
 // alguns números
 int i = 37;
 int j = 42;
 int k = 42;
 System.out.println("Variables values...");
 System.out.println(" i = " + i);
 System.out.println(" j = " + j);
 System.out.println(" k = " + k);
 // maior que
 System.out.println("Greater than...");
 System.out.println(" i > j = " + (i > j)); //false
 System.out.println(" j > i = " + (j > i)); //true
 System.out.println(" k > j = " + (k > j)); //false
 // maior ou igual a
 System.out.println("Greater than or equal to...");
 System.out.println(" i >= j = " + (i >= j)); //false
 System.out.println(" j >= i = " + (j >= i)); //true
 System.out.println(" k >= j = " + (k >= j)); //true
 // menor que
 System.out.println("Less than...");
 System.out.println(" i < j = " + (i < j)); //true
 System.out.println(" j < i = " + (j < i)); //false
 System.out.println(" k < j = " + (k < j)); //false
 // menor ou igual a
 System.out.println("Less than or equal to...");
 System.out.println(" i <= j = " + (i <= j)); //true
 System.out.println(" j <= i = " + (j <= i)); //false
 System.out.println(" k <= j = " + (k <= j)); //true
 // igual a
 System.out.println("Equal to...");
 System.out.println(" i == j = " + (i == j)); //false
 System.out.println(" k == j = " + (k == j)); //true
 // diferente
 System.out.println("Not equal to...");
 System.out.println(" i != j = " + (i != j)); //true
 System.out.println(" k != j = " + (k != j)); //false
     }
}
