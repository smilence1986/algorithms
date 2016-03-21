package algorithms;

import java.util.Random;

public class Lina {
	public static void bubboSort(int[] a){
		for (int i = 0; i < a.length -1 ; i++) {
			for (int j = 0; j < a.length - i -1; j++) {
				if(!less(a , j, j+1)){
					exch(a , j, j+1);
				}
			}
		}
	}
	private static boolean less(int[] a, int i, int j){
		return a[i] <= a[j];
	}
	private static void exch(int[] a, int i, int j){
		int tmp;
		tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	private static void show(int[] a){
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"...");
		}
		System.out.println();
	}
	private static boolean isSorted(int[] a){

		for (int i = 0; i < a.length -1; i++) {
			if(!less(a, i ,i+1)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(100);
		}
		show(a);
		bubboSort(a);
		show(a);
		System.out.println(isSorted(a));
		
	}

}
