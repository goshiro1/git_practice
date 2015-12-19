/*
 * @author hakutosuzuki
 * @since 2015/12/17
 */
package java_practice;

public class hakuto_java12 {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setData("プリウス", 2011, 1.4);
		Car c2 = new Car("アクセラ");
		c2.setData(2015, 12.17);
		printCar(c1);
		printCar(c2);

	}

	private static void printCar(Car c){
		System.out.println(c.getMakeYear() + "年製の" + c.getName() + "の車重は" + c.getWeight() + "トンです");
	}
}
