package trimestre2.arrays.ordenacion;

import java.util.Arrays;

public class ejQuick {
    public static void main(String[] args) {
		
		char [] letras = {'d','x','a','r','p','j','i'};
		
		System.out.println("desordenado");
		System.out.println(Arrays.toString(letras));
		
		quickSort.qsort(letras);
		
		System.out.println("ordenado");
		System.out.println(Arrays.toString(letras));
		
		int [] num = new int [5000];
		
		for(int i=0; i<num.length; i++)
			num[i]=(int) (Math.random()*1000);
		
		System.out.println("desordenado");
		System.out.println(Arrays.toString(num));
		
		quickSort.qsort(num);
		
		System.out.println("ordenado");
		System.out.println(Arrays.toString(num));
		
	}
}
