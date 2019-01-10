import javax.swing.*;
import java.util.Random;

public class Aufgabe3 {


    public static void main (String[]args){

        Random two = new Random();
        int [] array = new int[100];

        for(int i = 0; i<array.length; i++)
        array[i]= two.nextInt(100);


        while(true){

            String change = JOptionPane.showInputDialog("Welchen Wert möchten Sie ändern?");

            if (isNumeric(change)){

                int number = Integer.parseInt(change);

                int check = JOptionPane.showConfirmDialog(null, "Der Wert ist: " + array[number], "Möchtest du den Wert ändern? ", JOptionPane.YES_NO_OPTION);

                if (check == JOptionPane.YES_OPTION){

                    int newValue = Integer.parseInt(JOptionPane.showInputDialog("Wie soll der neue Wert lauten?"));

                    array[number] = newValue;

                    JOptionPane.showMessageDialog(null, "Der neue Wert: " +array[number] + " wurde erfolgreich eingetragen");
                }
            }

            else{

                break;

            }

        }

    }

    private static boolean isNumeric(String input){
        try {

            int number = Integer.parseInt(input);
            return (true);
        }
        catch (NumberFormatException ex){

            return (false);
        }
    }

}
