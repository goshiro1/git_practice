/*
 * @author hakutosuzuki
 * @since 2015/12/05
 */
package java_practice;

public class List2_16 {

	public static void main(String[] args) {
		//下り型三角形1
        	//縦5行の範囲
		for(int i = 0; i < 5; i++){
            		//1つずつ減らしていく
			for(int j = 0; j < 5-i; j++){
				System.out.print("*");
			}
            		//次のループへ移動する際に改行する
			System.out.println("");
		}
        	//上り型縦5行の範囲
		for(int i = 0; i <= 6; i++){
            		//@マークを１つずつ増やしていく
			for(int j = 1; j < i; j++){
				System.out.print("@");
			}
            		//次のループへ移動する際に改行する
			System.out.println("");
		}
		//ピラミッド型三角形
        	//縦5行の範囲
		for(int i = 1; i <= 5; i++){
			for(int j = 1; j <= (5-i); j++)
				System.out.print(" ");
				
			for(int j = 1; j <=2*i-1; j++)
				System.out.print("*");
            		//次のループへ移動する際に改行する
			System.out.println("");
		}
	}
}
