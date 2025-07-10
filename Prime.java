import java.util.Scanner;
public class Prime{
	public static boolean isPrime(int data){
		for(int i=2;i<data/2;i++){
			if(data%i==0){
				return false;
			}
		}
		
		return true;
	}
	public static void main(String []args){
		int n=5;
		do{
			if(n==5){
				System.out.println("ENTER A NO. TO CHECK PRIME :");
				int data = new Scanner(System.in).nextInt();
				if(isPrime(data))
					System.out.println(data+" is a prime no.");
				else
					System.out.println(data+" is a not prime no.");
			}else{
				break;
			}
			
			System.out.println("TO CONTINUE PRESS '5' OTHERWISE PRESS ANYTHING");
			n=new Scanner(System.in).nextInt();
		}
		while(n==5);
		
	}
}