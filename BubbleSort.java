import java.util.Scanner;
public class BubbleSort{
	public static void main(String []args){
		int []data = {18,12,36,8,1,76};
		
		for(int x:data)
			System.out.print(x+" ");
		
		System.out.println("After Bubble Sorting");
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data.length-1;j++){
				if(data[j]>data[j+1]){
					int temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
				}
			}
		}
		
		for(int x:data)
			System.out.print(x+" ");
	}
}
