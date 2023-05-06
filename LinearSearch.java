import java.util.Scanner;
public class LinearSearch{
	public static void main(String[] args) {
		int[] myArray = {1,7,9,2,8,45,90,13,71,95,4,97};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number you want to search : ");
		int searchNum = sc.nextInt();
		sc.close();

		boolean flag = false;

		for(int i=0; i<myArray.length; i++){
			if(myArray[i]==searchNum){
				System.out.println("Position Of Number in Array is "+(i+1)+" .");
				flag = true;
				break;
			}
		}
		if(!flag){
			System.out.println("Number Not Found");
		}
	}
}