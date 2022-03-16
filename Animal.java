
public class Animal {
	
	String color;
	int age;
	void initializeobj(String c, int a) {
		color = c;
		age  = a;
	}
	public void display(){
			System.out.println(color + ", "+age);
		
		
	}

	public static void main(String[] args) {
		Animal buzo = new Animal();
		buzo.color= "black";
		buzo.age = 5;
		buzo.display();
	}

}
