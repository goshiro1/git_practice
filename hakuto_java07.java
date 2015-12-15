/*
 * @author hakutosuzuki
 * @since 2015/12/12
 */
package java_practice;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class hakuto_java07 {

	public static void main(String[] args) {
		//HashSet(重複を許さない集合構造)で要素をセット
		Set<String> set = new HashSet<String>();
		set.add("iPhone");
		set.add("Android");
		set.add("BlackBerry");
        //addメソッドで重複があれば挿入しない
		if(!set.add("iPhone")){
			System.out.println("iPhoneを追加できません");
		}
        //セットに要素iPhoneがあるか判定
		if(set.contains("iPhone")){
			System.out.println("iPhoneは既に存在します");
		}
        //イテレータで処理実行
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()){
			String item = iter.next();
			System.out.println(item);
		}
	}
}

