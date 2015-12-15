/*
 * @author hakutosuzuki
 * @since  2015/12/11
 */
package java_practice;

import java.util.ArrayList;
import java.util.Iterator;

public class hakuto_java06 {

	public static void main(String[] args) {
        //配列に要素を格納
		ArrayList<String> list = new ArrayList<String>(); 
		list.add("水泳");
		list.add("サッカー");
		list.add("陸上");
		//イテレータを使用し、要素すべてに処理を実行
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()){
			String item = iter.next();
			System.out.println(item);
		}
	}

}
