/*
 * @author hakutosuzuki
 * @since 2015/12/08
 */
package java_practice;

import java.util.Scanner;

public class List2_19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        //インデックス入力
		int num;
		System.out.print("インデックスを入力＞");
		num = scan.nextInt();
        //10個の配列を生成
		int[] a = new int[10];
        //i+1を配列の中身に代入
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1 ;
		}
		System.out.println("要素" + num + "中身は" + a[num]);
	}
}
