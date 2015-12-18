package main;

public class main {

	public static void main(String[] args) {
		
		System.out.println("あなたの体重を入力してください");
		String bw = new java.util.Scanner(System.in).nextLine();
		Double byw = Double.valueOf(bw);
		
		System.out.println("あなたの身長を入力してください");
		String ht = new java.util.Scanner(System.in).nextLine();
		Double het = Double.valueOf(ht);
		
		Double BMIa = bodyw(byw,het);
		System.out.println("あなたのBMIは" + BMIa + "です。");
	}
	public static Double bodyw(Double byw,Double het){
	Double hett = het * 100;
	Double BMI = byw / (hett*hett);
	Double BMIa = BMI*100000000;
	return BMIa;
	}
}