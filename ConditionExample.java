import java.util.*;
class ConditionExample{
	public static void main(String[] args) {
	Scanner object= new Scanner(System.in);
		System.out.println("Enter a number");
		int n = object.nextInt();
		if (n>0) {
			System.out.println("Number is Positive");	
		}
		else if(n<0){
			System.out.println("Number is Negative");
		}
		else {
			System.out.println("0");
		}
		}
	}
