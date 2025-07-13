import java.util.Scanner;
public class SelectionSort{
	public static void selectionSort(int []data){
		for(int i=0;i<data.length;i++){
			for(int j=1+i;j<data.length;j++){
				if(data[j]<data[i])
				{
					int temp = data[j];
					data[j]=data[i];
					data[i]=temp;
				}
			}
		}
	}
	public static void main(String []args){
		
		
	
		int []data = {20,4,31,2,84,1,12,5,65,37,-2,648,647,-3,34,2};
		
		for(int x:data)
			System.out.print(x+" ");
		
		SelectionSort.selectionSort(data);
		
		System.out.println("\nAFTER SELECTION SORT :");
		
		for(int x:data)
			System.out.print(x+" ");
		
	}
}