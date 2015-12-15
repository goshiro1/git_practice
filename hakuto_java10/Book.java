/*
 * @author hakutosuzuki
 * @since 2015/12/15
 */
package java_practice;

public class Book {
    //フィールド変数
	private String syosai,syosai1,syosai2,syosai3,syosai4;
	private int teika,zaiko;
    
    //コンストラクタ
	void setData(String string, String string2, String string3,
			String string4, int int1, String string6, int int2){
        //Bookインスタンスに変数をセット
		syosai = string;
		syosai1 = string2;
		syosai2 = string3;
		syosai3 = string4;
		syosai4 = string6;
		teika = int1;
		zaiko = int2;

	}
    //引数なしのprintdataメソッド　出力
	void printData(){
		System.out.println(syosai + syosai1 + syosai2 + syosai3 + teika + syosai4 + zaiko);
		
	}
    //引数intのprintdataメソッド　定価を返す
	int getTeika(){
		return teika;
	}
	
}
