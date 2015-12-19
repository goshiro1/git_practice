/*
 * @author hakutosuzuki
 * @since  2015/12/16
 */
package java_practice;

public class hakuto_java {

	public static void main(String[] args) {

		Dog d1 = new Dog("ポチ");

		d1.setBirthYear(2003);

		System.out.println("ぼくの名前は" + d1.getName() + "です");
		System.out.println( "ぼくは" + d1.getBirthYear() + "年生まれの犬です。" );

	}
}