/*
 * @author hakutosuzuki
 * @since 2015/12/17
 */
package java_practice;

public class Car {


	private String name;
	private int makeyear;
	private double weight;

	Car(){
	}
	public void setData(String n, int m , double w){
		name = n;
		makeyear = m;
		weight = w;
	}
	Car(String n){
		name = n;
	}
	public void setData(int m , double w){

		makeyear = m;
		weight = w;
	}	

	public String getName(){
		return name;
	}

	public int getMakeYear(){
		return makeyear;
	}

	public double getWeight(){
		return weight;
	}




}
