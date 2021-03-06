/**
 * A class program that tests Magic Squares to see if they are really magical or not
 * 
 * Aayush Chanda
 * Magic Class
 */
public class MagicClass
{
    //Initializing an array for the constructor
    int[][] array;
    
    //Constructor
    public MagicClass(int[][] array)
    {
        this.array = array;
    }
    
    //Method to check whether a square is magical or not
    public boolean isMagic()
    {
        //variables to store the values returned from other methods that are needed
        int [] rowed = addRows();
        int [] columned = addColumns();
        int [] diaged = addDiag();
        int magic = getMagicNum();
        
        //check to see if the two arrays are equal in length
        if (rowed.length != columned.length)
        {
            System.out.println("1");
            return false;
        } 
        else 
        {
            //iterate over rowed to make sure that the numbers in rowed are equal to the magic number
            for (int i = 0; i < rowed.length; i++)
            {
                if (rowed[i] != magic)
                {
                    return false;
                }
            }
            
            //iterate over columned to make sure that the numbers in columned are equal to the magic number
            for (int j = 0; j < columned.length; j++)
            {
                if (columned[j] != magic)
                {
                    return false;
                }
            }
            
            //tests to see whether the numbers in the diaged array are equal to each other and the magic number
            if (diaged[0] != diaged[1] || diaged[0] != magic || diaged[1] != magic)
            {
                return false;
            }
            return true;
        }
    }
    
    //method that goes and takes the magic number
    public int getMagicNum()
    {
        int magic = addColumn(0);
        return magic;
    }
    
    //method that adds up all the ints in a row of the array
    public int addRow(int row)
    {
        int rowAdded = 0;
        for (int r = 0; r < array.length; r++)
        {
            // the first index is the row number (constant at "row")
            // the second index is the colum number (changes with "r")
            rowAdded += array[row][r];
        }
        
        return rowAdded;
    }
    
    //creates an array of all the sums of the rows
    public int[] addRows()
    {
        int[] sums = new int[array.length];
        for (int r = 0; r < array.length; r++)
        {
            sums[r] = addRow(r);
        }
        
        return sums;
    }
    
    //method that adds up all of the ints in a column of the array
    public int addColumn(int col)
    {
        int colAdded = 0;
        for (int c = 0; c < array.length; c++)
        {
            // the first index is the row number (changes with "c")
            // the second index is the colum number (constant at "col")
            colAdded += array[c][col];
        }
        
        return colAdded;
    }
    
    //creates an array of all the sums of the columns
    public int[] addColumns()
    {
        int[] sumss = new int[array.length];
        for (int c = 0; c < array.length; c++)
        {
            sumss[c] = addColumn(c);
        }
        
        return sumss;
    }
    
    //Adds up all of the diaganols and then creates an array with the number in it 
    public int[] addDiag()
    {
        int diagAdded = 0;
        int otherDiagAdded = 0;
        for (int d = 0, d1 = 0; d < array.length; d++, d1++)
        {
            diagAdded += array[d][d1];
        }
        
        for (int d2 = 0, d3 = array.length - 1; d3 >= 0; d2++, d3--)
        {
            otherDiagAdded += array[d2][d3];
        }
        int[] diagArray = new int[2];
        diagArray[0] = diagAdded;
        diagArray[1] = otherDiagAdded;
        
        return diagArray;
    }
    
    public String toString()
    {
        for (int a = 0; a < array.length; a++)
        {
            for (int b = 0; b < array.length; b++)
            {
                System.out.print(array[a][b] + "\t");
            }
            System.out.println();
        }
        
        return "";
    }
}