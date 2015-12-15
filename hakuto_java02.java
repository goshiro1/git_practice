/*
 * @author hakutosuzuki
 * @since 2015/12/07
 */
package java_practice;

import java.util.Scanner;
public class List2_18 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num;
  　//うるう年判定するための年入力
		System.out.print("西暦を入力＞");
		num = scan.nextInt();
    //うるう同士判定
		if( isLeep(num) ){
			System.out.println(num + "年はうるう年です");
		}else{
			System.out.println(num + "年はうるう年ではない");
		}
	}
//うるう年判定メソッド
	public static boolean isLeep(int num){
		boolean result;
		result = ( num %4 == 0 && num%100!=0 || num%400 == 0); // あてはまればうるう年である
		return result;
	}
}
