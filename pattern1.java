package HackerRank;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size = s.nextInt();
		pattern(size);

	}

	public static void pattern(int size) {
		for(int i =0;i<size;i++){
			int j =size-1;
			while(j>i){
				System.out.print(" ");
				j--;
			}
			int k = i+1;;
			while(k>0){
				System.out.print("#");
				k--;
			}
			System.out.println();
		}
	}

}
