package algorithms;

import java.util.Random;

public class Lina {
	/**
	 * 冒泡排序
	 * 
	 * 它重复地走访过要排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来
	 */
	public static void bubboSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (!less(a[j], a[j + 1])) {
					exch(a, j, j + 1);
				}
			}
		}
	}

	/**
	 * 选择排序
	 * 
	 * 每一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，直到全部待排序的数据元素排完
	 */
	public static void selectSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int indexMin = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[indexMin] > a[j]) {
					indexMin = j;
				}
			}
			exch(a, i, indexMin);
		}

	}

	/**
	 * 插入排序
	 * 
	 * 有一个已经有序的数据序列，要求在这个已经排好的数据序列中插入一个数，但要求插入后此数据序列仍然有序
	 */
	public static void insertSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
					exch(a, j, j-1);
			}
		}
	}
	/**
	 * 希尔排序
	 * 
	 * 
	 */
	public static void shellSort(int[] a){
		
	}

	private static boolean less(int a, int b) {
		return a < b;
	}

	private static void exch(int[] a, int i, int j) {
		int tmp;
		tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	private static void show(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "...");
		}
		System.out.println();
	}

	private static boolean isSorted(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			if (!less(a[i], a[i + 1])) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] a = new int[50];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(1000);
		}
		show(a);
		// bubboSort(a);
		//selectSort(a);
		insertSort(a);
		show(a);
		System.out.println(isSorted(a));

	}

}
