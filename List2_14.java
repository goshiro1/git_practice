/*
 * @author hakutosuzuki
 * @since 2015/12/03
 */
package java_practice;

public class List2_14 {
	  　//フィールド変数scanner
        private static java.util.Scanner scanner;

	public static void main(String[] args){
	  	//テキストの表示
	   	System.out.println("ようこそ占いの館へ");
	   	//テキストの表示
	   	System.out.print("あなたの名前を入力してください>");
	   	//scannerのインスタンス
	   	scanner = new java.util.Scanner(System.in);
		String name = scanner.nextLine();
	   	//テキストの表示
	   	System.out.print("あなたの年齢を入力してください");
	   	//変数ageStringに1行の入力されたテキストを格納
	   	String ageString =
	   		scanner.nextLine();
	   	//ageStringをageに変換
	   	int age = Integer.parseInt(ageString);
	   	//0~3までの乱数を生成し、fortuneに格納
	   	int fortune = new java.util.Random().nextInt(4);
	   	//1~4に変更
	   	fortune++;
	   	//テキストの表示
	   	System.out.println("占いの結果が出ました！");
	   	//テキストの表示
	   	System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
	   	//テキストの表示
	   	System.out.println("1:大吉," + " 2:中吉," + " 3:吉," + " 4:凶");
	 }
}
