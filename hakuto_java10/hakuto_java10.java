/*
 * @author hakutosuzuki
 * @since 2015/12/15
 */
package java_practice;

import java.util.Scanner;

public class hakuto_java10 {

	public static void main(String[] args) {
        //スキャナインスタンス生成
		Scanner scan = new Scanner(System.in);
        //Book　インスタンス生成
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		Book b4 = new Book();
		Book b5 = new Book();


        //Bookインスタンスに要素を代入
		b1.setData("Java入門","宮本","ソフトバンククリエイティブ","2010-8" , 2000 ,"978-4-7973-5927-5" ,5);
		b2.setData("Java入門2","宮本","ソフトバンククリエイティブ","2010-8" , 2500 , "978-4-7973-5927-5" , 5);
		b3.setData("Java入門3","宮本","ソフトバンククリエイティブ","2010-8" ,  3000, "978-4-7973-5927-5" , 2);
		b4.setData("Java入門4","宮本","ソフトバンククリエイティブ","2010-8" , 3500 , "978-4-7973-5927-5" , 4);
		b5.setData("Java入門5","宮本","ソフトバンククリエイティブ","2010-8" , 4000 ,"978-4-7973-5927-5" , 10);

        //配列を生成し、b1~b5までを格納
		Book b[] = new Book[5];

		b[0] = b1;
		b[1] = b2;
		b[2] = b3;
		b[3] = b4;
		b[4] = b5;

		int x;
        
		System.out.print("金額を入力＞");
		x = scan.nextInt();
        //入力された金額で買える定価のBookをprintdataメソッドで実行
		for(int i = 0; i<b.length; i++){
			int y = b[i].getTeika();
			if(x >= y){
				b[i].printData();
			}
		}
	}
}
