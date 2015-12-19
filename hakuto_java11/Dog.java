/*
 * @author hakutosuzuki
 * @since  2015/12/16
 */
package java_practice;

public class Dog {
	private String name;
	private int birthYear; //誕生年
	
	Dog(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	public void setBirthYear(int y){ //セッター
		birthYear = y;
	}
	public int getBirthYear(){ //ゲッター
		return birthYear; 
	}
}


