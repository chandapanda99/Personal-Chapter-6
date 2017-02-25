/**
 * Write a description of class MagicClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MagicClass
{
    int[][] array;
    public MagicClass(int[][] array)
    {
        this.array = array;
    }
    
    public boolean isMagic()
    {
        int [] rowed = addRows();
        int [] columned = addColumns();
        int magic = getMagicNum();
        
        if (rowed.length != columned.length) {
            return false;
        } else {
            // TODO: iterate over "rowed" and "columned" and make sure
            // that every element is equal to the magic number "magic"
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
    
    public int getMagicNum()
    {
        int magic = addRow(0);
        return magic;
    }
    
    public void setMagicSquare(int[][] array)
    {
    }
    
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
    
    public int[] addRows()
    {
        int[] sums = new int[array.length];
        for (int r = 0; r < array.length; r++)
        {
            sums[r] = addRow(r);
        }
        
        return sums;
    }
    
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