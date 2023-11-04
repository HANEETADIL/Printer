
public class printerApp {

	public static void main(String[] args) {
		String creator;
		int num1;
		int num2;
		int multiplication;
		int addition;
		double division;
		int substraction;
		
		System.out.println("printer App");
		System.out.println("This app is made by");
		creator= "Haneeta";
		System.out.println("This app is made by "+ creator);
		
		num1 = 10;
		num2 = 2;
		System.out.println(num1);
		System.out.printf("The value of num1 is %d\n", num1);
		System.out.printf("The value of num2 is %d\n", num2);
		//This performs the multiplication
		multiplication = num1 * num2;
		System.out.println(num1+"*"+num2+"="+multiplication);
		//This performs the addition
		addition = num1 + num2;
		System.out.println(num1+" + "+ num2 + " = "+ addition);
		//This performs the division
		division = num1 / num2;
		System.out.println(num1+" / "+ num2 + " = "+ division);
		
		substraction = num1 - num2;
		System.out.println(num1+ " - " + num2 + " = " + substraction);
		

	}

}
