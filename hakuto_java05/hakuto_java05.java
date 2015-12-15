/*
 * @author hakutosuzuki
 * @since  2015/12/10
 */
package java_practice;

public class java_hakuto05 {

	public static void main(String[] args) {
        //インスタンス生成
		Person s1 = new Person();
		Person s2 = new Person();
		
        //s1へのセット
		s1.setName("田中");
		s1.setAge(15);
		s1.setTel("090-1234-5678");
		s1.setAddress("新宿区百人町");
        //s2へのセット
		s2.setName("山田");
		s2.setAge(20);
		s2.setTel("090-9876-4321");
		s2.setAddress("港区六本木");
		
		s1.printData();
		s2.printData();
	}
}
