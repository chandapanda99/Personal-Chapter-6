import java.text.DecimalFormat;
import java.text.NumberFormat;
//import cs1.Keyboard;
import javax.swing.*;

public class mathy
{
    private int [][] square;

    /**
        default constructor - stubed in

    */
    public mathy()
    {
        System.out.println ("hi from default constructor");
    }

    public mathy(int [][] array)
    {
        square = array;
    }


    /**
        take the absoulute value of the number
        @param int value
        @return absoulute value of number
    */
    public int abs (int x)
    {
        if (x < 0)
            x = -x;

        return x;



    }//end of abs






    //}end of class




    /**
        takes the odd numbers out of an array
        @param int[] values
        @return int[] odd values in the array
    */

    public  int[] getOdd ( int[] num1)
    {   
        int i = 0;
        int[] odd = new int[num1.length];
        int s = 0;
        
        for (i = 0; i < num1.length; i++)
        {
            if ((num1[i] % 2) != 0)
            {
                odd [i] = num1[i];
                s++;
            }
        }
        
        return odd;


    }//end of getOdd






    public void getEven(int[] num, int evennum [])
    {
        int f = 0;
        int[] even = new int[num.length];
        int c = 0;
        
        for (f = 0; f < num.length; f++)
        {
            if ((num[f] % 2) != 0)
            {
                even[f] = num[f];
                c++;
            }
        }



    }//end of getEven







    /**
        two int parameters and adds them
        @param 2 int values
        @return int sum of values
    */


    public int add (int x, int y)
    {   //System.out.println(sum );
        int sum;      //sum x and y are local var
        sum = x+y;

        return sum;


    }//end of add


    public double add (double x,double y)
    {

        return x+y;
    }

    /**
            message from Mathy class
            @param none
            @return String message
    */


    public String toString()
    {
        return ("Hi what do you want?, I'm just Mathy");

    }


    public void switchThem (int[] a1, int a2[])
    {
        int [] temp = a1;




    }
    
    public void count(int[] a1, int[] a2)
    {
        for (int i : a1)
            a2[i] ++;



    }


    public static int sum2DArray(int [][] scores)
    {
        for ( int row=0, sum = 0; row < scores.length; row++)
        {
            for (int col=0; col < scores[row].length; col++)
            {
                sum += scores[row][col];
            }

            System.out.println();
        }
        return 0;
    }



    public int sumOneRow2DArray(int row)
    {   int total = 0;




        return total;

    }

    
    public int sumOneRow2DArray(int col, int [][] array)
    {
        int total = 0;
        
        for (int i = 0; i < array.length; i++)
        {
            total += array[i][col - 1];
        }
        
        return total;
    }



    public int[] sumall2DArray(int [][] scores)
    {
        int [] temp = {1,2,3,4,};




        return temp;
    }

    /**
        Doubles the size of an array
        @param int []
        @return int [] twice the size, with values copied over
    */
    public static int[] doubleSize(int[] array)
    {
        
        //make temp 2 times the size of array
        int[] temp = new int[array.length * 2];
        System.out.println(temp.length +"-" );

        //copy all the values over to new array
        for (int i = 0; i < array.length; i++)
             temp[i] = array[i];

        //old array changes reference to new larger array
        array = temp;

        return array;

    }

















}//end of class