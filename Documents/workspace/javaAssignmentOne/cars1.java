package Java_Assignments;
//Usage of this() keyword

public class cars1 {
	String model;
	String color;
	int num;
cars1(String model, String color ){
	this.model = model;
	this.color = color;
}
cars1 (String model, String color, int num){
	this(model,color);
	this.num = num;
}
void display() {System.out.println(model+" "+color+" "+num);}
	public static void main(String[] args) {
		cars1 c1 = new cars1("Tesla","Grey");
		cars1 c2 = new cars1("Prius","Red",1384);
		c1.display();
		c2.display();
				

	}

}