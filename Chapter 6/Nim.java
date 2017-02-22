/**
 *
 */
import java.util.*;
public class Nim
{
    public static void main(String[] args)
    {
        Scanner Keyboard = new Scanner(System.in);
        int rowChoice = 0;
        int stoneChoice = 0;
        int turn = 1;
        int[] array = new int[3];
        array[0] = 3;
        array[1] = 5;
        array[2] = 8;
        
        while (array[0] != 0 || array[1] != 0 || array[2] != 0)
        {
            System.out.println("\nIt is player " + turn + "'s turn");
            
            System.out.print("Row 1: ");
            for (int i = 0; i < array[0]; i++)
            {
                System.out.print("O");
            }
            System.out.println("\t" + "(" + array[0] + ")");
            
            System.out.print("Row 2: ");
            for (int i = 0; i < array[1]; i++)
            {
                System.out.print("O");
            }
            System.out.println("\t" + "(" + array[1] + ")");
            
            System.out.print("Row 3: ");
            for (int i = 0; i < array[2]; i++)
            {
                System.out.print("O");
            }
            System.out.println("\t" + "(" + array[2] + ")");
            
            System.out.println("\nWhat row do you want to take from? ");
            rowChoice = Keyboard.nextInt();
            System.out.println("How many stones do you want to take from " + rowChoice + ": ");
            stoneChoice = Keyboard.nextInt();
            if (rowChoice == 1)
            {
                array[0] -= stoneChoice;
                if (array[0] < 0)
                {
                    array[0] = 0;
                }
            }
            
            else if (rowChoice == 2)
            {
                array[1] -= stoneChoice;
                if (array[1] < 0)
                {
                    array[1] = 0;
                }
            }
            else if (rowChoice == 3)
            {
                array[2] -= stoneChoice;
                if (array[2] < 0)
                {
                    array[2] = 0;
                }
            }
            
            if (turn == 1)
            {
                turn = 2;
            }
            else {
                turn = 1;
            }
        }
        
        System.out.println("Player " + turn + " is the winner!!");
    }
}
