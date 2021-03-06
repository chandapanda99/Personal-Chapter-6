import java.util.*;

class ArrayReview {
    
    public static void main () {
        
        // (1) ARRAYS
        
        // when you make an array, you say THREE
        // TYPE of the data
        // NAME of the variable
        // LENGTH of the array
        
        // kinds of arrays
        // kind #1: "flat" array
        Integer[] array1 = new Integer[10];
        // kind #2: ArrayList
        ArrayList <Integer> array2 = new ArrayList<>();
        
        // how to get information INTO the FLAT array
        array1[0] = 7;
        array1[6] = 2;
        
        // how to get information INTO the ArrayList
        array2.add(4);
        array2.add(7);
        
        // how to get the size of an array
        int length1 = array1.length; // 10
        int length2 = array2.size(); // 2
        
        // how to get information OUT of a FLAT array
        int thing1 = array1[6];
        
        // how to get information OUT of an ArrayList
        int thing2 = array2.get(1);
        
        // differences between the two kinds of arrays:
        // the flat arrays use field / property / variable
        // the ArrayList uses method / function
        
        // (2) FOR LOOPS
        
        // two kinds of for loops
        // index loops
        // eleement loops
        
        // index loop that prints everything in array1
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        
        // index loop that prints everything in array2
        for (int i = 0; i < array2.size(); i++) {
            System.out.println(array2.get(i));
        }
        
        // eleement loops that prints everything in array1
        // NOT possible (i think, maybe we should test?)
        
        // eleement loops that prints everything in array2
        // "Integer element" is a NEW VARIABLE decleration
        for (Integer element : array2) {
            System.out.println(element);
        }
        
        // (3) 2D ARRAYS
        
        // "2 dimensional" or "a list of lists"
        double[][] array3 = new double[2][2];
        ArrayList< ArrayList<Double> > array4 = new ArrayList<>();
        
        array3[0][0] = 1.0; // we specify the index as we go
        array3[0][1] = 2.0;
        array3[1][0] = 3.0;
        array3[1][1] = 4.0;
        
        ArrayList<Double> row1 = new ArrayList<>();
        row1.add(1.0); // we do NOT need to know which index we are on
        row1.add(2.0);
        ArrayList<Double> row2 = new ArrayList<>();
        row2.add(3.0);
        row2.add(4.0);
        array4.add(row1);
        array4.add(row2);
        
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                System.out.println(array3[i][j]);
            }
        }
        
        for (int i = 0; i < array4.size(); i++) {
            for (int j = 0; j < array4.get(i).size(); j++) {
                System.out.println(array4.get(i).get(j));
            }
        }
        
        // goal: re-use as LITTLE code as possible
        for (int i = 0; i < array4.size(); i++) {
            ArrayList<Double> row = array4.get(i);
            for (int j = 0; j < row.size(); j++) {
                System.out.println(row.get(j));
            }
        }
        
        // goal: make your code as SIMPLE as possible
        for (ArrayList<Double> row : array4) {
            for (Double number : row) {
                System.out.println(number);
            }
        }
        
    }
    
}