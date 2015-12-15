/*
 * @author hakutosuzuki
 * @since 2015/12/14
 */

package java_practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hakuto_java09 {

	public static void main(String[] args) {
        //スキャナーインスタンスを生成
		Scanner scan = new Scanner(System.in);
        //HashMapクラスを使いインスタンスを生成
		Map<String,String> map = new HashMap<String,String>();
		//3回繰り返し
        for(int i = 0; i < 3; i++){
            //str1にマイナンバーを代入
            System.out.print("マイナンバーを入力＞");
            String str1 = scan.next();
            //str2に氏名を代入
            System.out.print("氏名を入力＞");
            String str2 = scan.next();
            //Mapに格納(キー,要素)
            map.put(str1,str2);
		
        }
        
		System.out.print("自分のマイナンバーを入力>");
		//入力されたマイナンバーをstr3に代入
        String str3 = scan.next();
        //getメソッドでstr3の要素(str1)をvalueに代入
		String value = map.get(str3);
		System.out.println(value);
	}
}
