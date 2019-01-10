import javax.swing.*;
import java.util.Random;

public class Aufgabe2 {

    public static void main (String[]args){

        int lenght = Integer.parseInt(JOptionPane.showInputDialog("Bestimmen Sie die Länge des Arrays"));
        int [] array = new int[lenght];

        Random  one = new Random();

        for (int i = 0; i<lenght; i++)
            array [i] = one.nextInt(1000);

        for (int i = array.length -1; i>=0; i--) // Gibt Zahlen in umgekehrter Reihenfolge aus

        {

            System.out.println(array[i]+ " ");

        }

    }

}
