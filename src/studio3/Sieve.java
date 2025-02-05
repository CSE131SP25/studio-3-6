package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int [] array = new int [n];
		boolean [] boolarray = new boolean [n];

		for(int j = 0; j < n; j++) {
			array[j] = j+2;
		}
		for(int i = 0; i < array.length-1; i++) {
			//System.out.println(array[i]);
			boolarray[i] = true;
		}
		
		for(int k = 0; k < array.length-1; k++) {
			if(boolarray[k] == true) {
				for(int l =0; l < array.length; l++) {
					if(array[l]%array[k]==0 && array[l]!=array[k]) {
						boolarray[l] = false;
					} else {
						continue;
					}
						
				}
			}else {
				continue;
			}
		}
		
		for(int p = 0; p < array.length-1; p++) {
			//System.out.println(boolarray[p]);
			if(boolarray[p]==true) {
				System.out.println(array[p]);

			}
		}
		
	}

}
