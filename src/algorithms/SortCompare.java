package algorithms;

import java.util.Random;

public class SortCompare {
	public static long time(String alg, int[] a) {
		long start = System.currentTimeMillis();
		if(alg.equals("bubbo"))  Lina.bubboSort(a);
		if(alg.equals("select")) Lina.selectSort(a);
		if(alg.equals("insert")) Lina.insertSort(a);
		if(alg.equals("shell"))  Lina.shellSort(a);
		long end   = System.currentTimeMillis();
		return end - start;
	}
	public static double timeRandomInput(String sortType, int numLength, int T){
		//将T个长度为numLength的数组排序
		double total = 0.0;
		int[] a = new int[numLength];
		for (int i = 0; i < T; i++) {
			for (int j = 0; j < numLength; j++) {
				a[i] = new Random().nextInt(100000);
			}
			total += time(sortType, a);
		}
		return total;
	}
	public static void main(String[] args) {
		int numLength = 1000;
		int T = 1000;
		double t1 = timeRandomInput("bubbo", numLength, T);
		double t2 = timeRandomInput("select", numLength, T);
		double t3 = timeRandomInput("insert", numLength, T);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}
}
