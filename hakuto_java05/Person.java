package java_practice;

public class Person {
	private String name,tel,address;
	private	 int age;
	
	void setName(String s){
		name = s;
	}
	void setAge(int s){
		age = s;
	}
	void setTel(String s){
		tel = s;	
	}
	void setAddress(String s){
		address = s;
	}
	void printData(){
		System.out.println(name + " "+  age + " " + tel + " " + address);
	}

}


