
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args)
    {
        // ADVANCED ARRAY CONCEPTS!
        
        // Array of objects of type Circle
        
        // We must initialize the size of the array first!
        Circle circles[] = new Circle[5];
        
        // We must initialize each individual circle in the array
        circles[0] = new Circle( 2 );
        circles[1] = new Circle( 5.5 );
        circles[2] = new Circle( 52 );
        circles[3] = new Circle( 4 );
        circles[4] = new Circle( 33.5 );
        
        for( int k = 0; k < circles.length; k++ )
        {
            //System.out.println( circles[k] );
        }
        
        
        // Comparison of array values
        // Comparing values in numeric arrays:
        double n[] = new double[10];
        // .
        // .
        // .
        // (more code missing)
        // if( n[3] == n[k+1] ) // valid, as long as k+1 is within the index of n
        // if( n[3] >= n[k+1] )
        
        // Comparing values in String arrays:
        String str[] = new String[20];
        // .
        // .
        // .
        // (more code missing)
        // if( str[3].equals("banana") )  // valid
        // if( str[3].compareTo("apple" ) ) // recall how compareTo works
        
        // Compare objects in arrays:
        if( circles[3].equals( new Circle( 4 ) ) )
        {
            System.out.println("The circles have the same radius!");
        }
        
        // ALWAYS BE AWARE OF NullPointerExceptions!
        
        // Different references to the same array (this can be confusing)
        
        int []frst = { 3, 4, 5, 6, 7, 8 };
        int sec[];
        
        sec = frst;
        sec[2] = 99;
        System.out.println( frst[2] );  // What is printed? 99
        
        // Array variables work like pointers to objects in memory.
        // Every array is considered an object.
        
        // Remove an array from memory (works exactly how you would remove
        // ANY object from memory - set all pointers to null.
        
        frst = null;
        sec = null;
        
        
        
        // Copy from an array to another array:
        
        // There's a method called System.arraycopy that does this already.
        // Here's how you use it:
        // public void arraycopy( theFromArray, fromIndex, theToArray, toIndex, howMany )
        
        char ch[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
        char nn[] = {'1', '2', '3', '4', '5', '6', '7', '8' };
        
        System.arraycopy( ch, 1, nn, 2, 3 );
        
        for( int k = 0; k < nn.length; k++ )
        {
            System.out.print( nn[k] + " " );
        }
        // what is printed after the for loop runs completely? 
        
        System.out.println();
        
        // Converting a String into a character array:
        
        String s = "Brandon";
        char charArray[] = s.toCharArray();
        
        // charArray would look like this:  { 'B', 'r', 'a', 'n', 'd', 'o', 'n' }
        
        // It's also possible to reverse the process and convert a character array to a String:
        
        String name = String.copyValueOf( charArray );
        System.out.println(name); // prints Brandon
        
        
        
        // Logical size and Physical size of arrays:
        
        int jk[] = new int[30];
        int max = 5;
        for(int j = 0; j < max; j++ )
        {
            jk[j] = j*36;
        }
        //  What is the physical size of jk?  30 
        //  What is the logical size of jk?  5
        
        
        
        
    }
}
