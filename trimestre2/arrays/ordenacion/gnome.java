package trimestre2.arrays.ordenacion;

public class gnome {

    static void gnomeSort( int[] arr ) { 
        for ( int i = 1; i < arr.length; ) { 
           if ( arr[i - 1] <= arr[i] ) { 
              ++i; 
           } else { 
              int tempVal = arr[i]; 
              arr[i] = arr[i - 1]; 
              arr[i - 1] = tempVal; 
              --i; 
              if ( i == 0 ) { 
                 i = 1; }           
           } 
        }
    }
}
