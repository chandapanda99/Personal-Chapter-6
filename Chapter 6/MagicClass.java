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
        
        if (rowed.length != columned.length)
        {
            return false;
        }
        else {
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
            colAdded += array[col][c];
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
