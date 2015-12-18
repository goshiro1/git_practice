package Java7;

public class Java7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("BMIを算出します");
		System.out.println("身長を入力してください(cm)");
		double a = new java.util.Scanner(System.in).nextInt();
		System.out.println("体重を入力してください(kg)");
		double b = new java.util.Scanner(System.in).nextInt();
		double c = b/(a*a)*10000;
		System.out.println("あなたのBMIは" + c + "です。");
	}
}
