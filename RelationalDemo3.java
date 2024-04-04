/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.relationaldemo3;

/**
 *
 * @author LAB07
 */
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class RelationalDemo3 {
  public static void main(String[] args) {
    int i, j, k;

    // Obter entrada do usuário para os números
    String entrada = JOptionPane.showInputDialog("Digite o primeiro número: ");
    i = Integer.parseInt(entrada);

    entrada = JOptionPane.showInputDialog("Digite o segundo número: ");
    j = Integer.parseInt(entrada);

    entrada = JOptionPane.showInputDialog("Digite o terceiro número: ");
    k = Integer.parseInt(entrada);

    // Criar uma JTextArea para exibir os resultados
    JTextArea areaDeTexto = new JTextArea();
    areaDeTexto.setEditable(false);  // Desabilitar edição

    // Acrescentar resultados das operações relacionais à areaDeTexto
    areaDeTexto.append("i = "+i);
    
    areaDeTexto.append("j = "+j);
    
    areaDeTexto.append("k = "+k);
    
    areaDeTexto.append("Resultados:\n");

    areaDeTexto.append("i > j = " + (i > j) + "\n");
    areaDeTexto.append("j > i = " + (j > i) + "\n");
    areaDeTexto.append("k > j = " + (k > j) + "\n\n");

    areaDeTexto.append("i >= j = " + (i >= j) + "\n");
    areaDeTexto.append("j >= i = " + (j >= i) + "\n");
    areaDeTexto.append("k >= j = " + (k >= j) + "\n\n");

    areaDeTexto.append("i < j = " + (i < j) + "\n");
    areaDeTexto.append("j < i = " + (j < i) + "\n");
    areaDeTexto.append("k < j = " + (k < j) + "\n\n");

    areaDeTexto.append("i <= j = " + (i <= j) + "\n");
    areaDeTexto.append("j <= i = " + (j <= i) + "\n");
    areaDeTexto.append("k <= j = " + (k <= j) + "\n\n");

    areaDeTexto.append("i == j = " + (i == j) + "\n");
    areaDeTexto.append("k == j = " + (k == j) + "\n");

    areaDeTexto.append("i != j = " + (i != j) + "\n");
    areaDeTexto.append("k != j = " + (k != j) + "\n");

    // Exibir a areaDeTexto em um JOptionPane
    JOptionPane.showMessageDialog(null, areaDeTexto, "Operações Relacionais", JOptionPane.INFORMATION_MESSAGE);
  }
}
