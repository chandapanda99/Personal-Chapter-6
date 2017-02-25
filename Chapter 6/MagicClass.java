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
        int magic = getMagicNum();
        
        //check to see if the two arrays are equal in length
        if (rowed.length != columned.length) {
            return false;
        } 
        else 
        {
            //iterate over "rowed" and "columned" and make sure that every element is equal to the magic number "magic"
            for (int i = 0; i < rowed.length; i++)
            {
                if (rowed[i] != magic)
                {
                    return false;
                }
            }
            
            for (int j = 0; j < columned.length; j++)
            {
                if (columned[j] != magic)
                {
                    return false;
                }
            }
            return true;
        }
    }
    
    //method that goes and takes the magic number
    public int getMagicNum()
    {
        int magic = addRow(0);
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
}