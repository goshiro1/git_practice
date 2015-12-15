/*
 * @author hakutosuzuki
 * @since 2015/12/04
 */
package java_practice;

public class List2_15 {

	public static void main(String[] args) {
		//標準出力
	   	//0~3までの乱数を生成し、fortuneに格納
	   	int fortune = new java.util.Random().nextInt(4);
        System.out.println("a="+fortune);
        //入力した値が、正の数かどうかを調べる
        if(fortune > 0){
            System.out.println("aは正の数です。");  //  正の数だった場合に実行
        	} else {
        		System.out.println("aは正の数ではありません"); //0だった場合に実行
        	}
	}
}
