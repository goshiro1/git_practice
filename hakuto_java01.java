/*
* @author hakutosuzuki
* @since  2015/12/06
*/
package java_practice;

import java.util.Scanner;
import java.util.Random;
public class List2_17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int len, max; 
		System.out.print("配列の長さを入力:");
		len = scan.nextInt(); 
		System.out.print("乱数の最大値を入力:");
		max = scan.nextInt();
		int[] data = new int[len];
		init(data, max);
		show(data); System.out.println("-----------"); 
		sort(data);
		show(data);
	}
	public static void init(int[] data, int max){ 
		Random rand = new Random();
		int r;

		for(int i=0; i<data.length; i++){ 
			r = rand.nextInt(max+1); data[i] = r;
		} 
	}
	public static void show(int[] data){ 
		for(int i=0; i<data.length; i++){
			System.out.println(data[i]); 
		}
	}
	//bubble sort
	public static void sort(int[] array){
		int i,j,tmp;
		int len = array.length;
		for(i=0;i<len-1;i++){
			for(j=0;j<len-i-1;j++){ 
				if(array[j]>array[j+1]){
					tmp = array[j]; 
					array[j]=array[j+1];
					array[j+1]=tmp;
				} 
			}
		} 
	}
}
