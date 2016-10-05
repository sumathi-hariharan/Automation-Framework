package Java_Assignments;
//Constructor Overloading
public class cars {
	String model;
	String color;
	int num;
cars(String m, String c ){
	model = m;
	color = c;
}
cars(String m, String c, int n){
	model = m;
	color = c;
	num = n;
}
void display() {System.out.println(model+" "+color+" "+num);}
	public static void main(String[] args) {
		cars c1 = new cars("Huyndai","Black");
		cars c2 = new cars("Toyoto","White",1384);
		c1.display();
		c2.display();
				

	}

}
