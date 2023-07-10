import java.util.Scanner;
class StackDemo{
	int top = -1;
	int[] arr;
	StackDemo(int n){
		arr = new int[n];
	}

	public void push(int n){
		if(top >= arr.length-1){
			System.out.println("Stack Overflow");
		}
		else{
			arr[++top] = n; 
		}
	}
	public int pop(){
		if(top <= -1){
			System.out.println("Stack Underflow");
			return -1;
		}
		return arr[top--];
	}
	public void display(){
		for(int i = 0 ; i <= top ; i++){
			System.out.println("["+arr[i]+"]");
		}
	}
	public int peep(int n){
		if(top-n+1 <= -1){
			System.out.println("Stack Underflow");
			return 0;
		}
		return arr[top - n];
	}
	public void change(int i, int n){
		if(top < i){
			System.out.println("Stack Underflow");
		}
		else{
			arr[top - i] = n;
		}
	}
}
public class StackFunction{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StackDemo obj;
		System.out.print("Enter Size of Stack : ");
		int n = scan.nextInt();
		obj = new StackDemo(n);
		int choice;
		System.out.println("Enter , ");
		System.out.println("1 : Push");
		System.out.println("2 : Pop");
		System.out.println("3 : Peep");
		System.out.println("4 : Change");
		System.out.println("5 : Display");
		System.out.println("6 : Exit");
		do{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your Choice : ");
			choice = scan.nextInt();
			switch(choice){
				case 1 : 
				 	System.out.print("Enter the element you want to push : ");
				 	int a = sc.nextInt();
				 	obj.push(a);
				 	break;
				case 2 : 
				 	int b = obj.pop();
				 	System.out.println("Poped element is "+b);
				 	break;
				case 3 : 
					System.out.print("Enter position of element you want to see : ");
				 	int num = sc.nextInt();
				 	int pe = obj.peep(num);
				 	System.out.println("Element at position "+num+" is "+pe);
				 	break;
				case 4 :
					System.out.print("Enter position of element you want to change : ");
				 	int pos = sc.nextInt();
				 	System.out.print("Enter element : ");
				 	int x = sc.nextInt();
				 	obj.change(pos, x);
				 	break; 
				case 5 : 
					obj.display();
					break;	
				case 6 :
					break;
				default : 
					System.out.println("Invalid Entry ! ");
			}
		}while(choice != 6);
	}
}