/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.relationdemo2;

import javax.swing.JOptionPane;


/**
 *
 * @author LAB07
 */
public class RelationDemo2 {

    public static void main(String[] args) {
 // alguns números
 int i = 37;
 int j = 42;
 int k = 42;
 JOptionPane.showConfirmDialog(null,"Variables values...");
 JOptionPane.showConfirmDialog(null," i = " + i);
 JOptionPane.showConfirmDialog(null," j = " + j);
 JOptionPane.showConfirmDialog(null," k = " + k);
 // maior que
 JOptionPane.showConfirmDialog(null,"Greater than...");
 JOptionPane.showConfirmDialog(null," i > j = " + (i > j)); //false
 JOptionPane.showConfirmDialog(null," j > i = " + (j > i)); //true
 JOptionPane.showConfirmDialog(null," k > j = " + (k > j)); //false
 // maior ou igual a
 JOptionPane.showConfirmDialog(null,"Greater than or equal to...");
 JOptionPane.showConfirmDialog(null," i >= j = " + (i >= j)); //false
 JOptionPane.showConfirmDialog(null," j >= i = " + (j >= i)); //true
 JOptionPane.showConfirmDialog(null," k >= j = " + (k >= j)); //true
 // menor que
 JOptionPane.showConfirmDialog(null,"Less than...");
 JOptionPane.showConfirmDialog(null," i < j = " + (i < j)); //true
 JOptionPane.showConfirmDialog(null," j < i = " + (j < i)); //false
 JOptionPane.showConfirmDialog(null," k < j = " + (k < j)); //false
 // menor ou igual a
 JOptionPane.showConfirmDialog(null, "Less than or equal to...");
 JOptionPane.showConfirmDialog(null," i <= j = " + (i <= j)); //true
 JOptionPane.showConfirmDialog(null," j <= i = " + (j <= i)); //false
 JOptionPane.showConfirmDialog(null," k <= j = " + (k <= j)); //true
 // igual a
 JOptionPane.showConfirmDialog(null,"Equal to...");
 JOptionPane.showConfirmDialog(null," i == j = " + (i == j)); //false
 JOptionPane.showConfirmDialog(null," k == j = " + (k == j)); //true
 // diferente
 JOptionPane.showConfirmDialog(null,"Not equal to...");
 JOptionPane.showConfirmDialog( null, " i != j = " + (i != j)); //true
 JOptionPane.showConfirmDialog( null, " k != j = " + (k != j)); //false
     }
}
    
