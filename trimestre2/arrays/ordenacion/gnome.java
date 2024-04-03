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

    public static void gnomeSortCaracteresInvertido(char[] arr) {
      int index = 0;
      while (index < arr.length) {
          if (index == 0) {
              index++;
          }
          if (arr[index] >= arr[index - 1]) {
              index++;
          } else {
              char temp = arr[index];
              arr[index] = arr[index - 1];
              arr[index - 1] = temp;
              index--;
          }
      }
  }

  public static void gnomeSortCaracteres(char[] arr) {
   int index = 0;
   while (index < arr.length) {
       if (index == 0) {
           index++;
       }
       if (arr[index] >= arr[index - 1]) {
           index++;
       } else {
           char temp = arr[index];
           arr[index] = arr[index - 1];
           arr[index - 1] = temp;
           index--;
       }
   }
}

public static void gnomeSortInvertido(int[] arr) {
   int index = 0;
   while (index < arr.length) {
       if (index == 0) {
           index++;
       }
       if (arr[index] >= arr[index - 1]) {
           index++;
       } else {
           int temp = arr[index];
           arr[index] = arr[index - 1];
           arr[index - 1] = temp;
           index--;
       }
   }
}
}
