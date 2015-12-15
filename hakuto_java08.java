/*
 * @author hakutosuzuki
 * @since 2015/12/13
 */
package java_practice;

import java.util.HashMap;
import java.util.Map;

public class hakuto_java08 {

	public static void main(String[] args) {
        //HashMapクラス(連想配列)を利用しキーと要素を追加する
		Map<String,String> map = new HashMap<String,String>();
        //実際の要素の追加(キー,要素)
		map.put("red", "赤");
		map.put("blue", "青");
		map.put("yellow", "黄");
        //getメソッドでキーを指定し、要素を取り出す
		String value = map.get("blue");
		System.out.println(value);
	}

}
