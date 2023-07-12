import java.util.Scanner;
public class QueueArray {
	 public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        Queue qu;
       	System.out.print("Enter Size Of Queue : ");
       	int size = sc.nextInt();
       	qu = new Queue(size);
        System.out.println("1: Inserting Element in Queue (Enqueue Function)");
        System.out.println("2: Deleting Element from Queue (Dequeue Function)");
        System.out.println("3: Display Queue");
        System.out.println("4: Exit");
        int ch;
        do {
            System.out.print("Enter your choice : ");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                    qu.enqueue();
                    break;
                case 2:
                	qu.dequeue();
                    break;
                case 3: 
                	qu.display();
                    break;
                case 4: 
                	System.out.println("Exiting...");
                    break;
                default: 
                	System.out.println("Invalid choice");
            }
        }
        while(ch!=4);
    }
}
class Queue {
	Scanner scan=new Scanner(System.in);
	int size;
	int[] queue;
	int front = -1;
	int rear = -1;

	Queue(int size){
		this.size = size;
		queue = new int[size];
	}

	public void enqueue(){
		if ( rear == size - 1){
			System.out.println("Queue is Full Element Can't Be Inserted");
		}
		else {
            System.out.print("Enter element to be inserted : ");
            int num=scan.nextInt();
			if (front == -1 && rear == -1){
				front = 0;
				rear = 0;
			}
			else {
				rear++;
			}
			queue[rear] = num ; 
		}
	}
	public void dequeue(){
		if (front == - 1) {
            System.out.println("Queue is Empty. Nothing to Delete.");
        }
        else {
        	int delElm = queue[front];
        	System.out.println("Element deleted from queue is : "+ delElm);
        	queue[front] = 0;

        	if(front == rear){  
                front = -1;  
                rear = -1 ;  
            }
            else{
                front++;
            }
        }
	}
	public void display() {
        if (front == - 1){
            System.out.println("Queue is empty. Nohing to Display.");
        }
        else {
            System.out.println("Elements are : ");
        	for (int i = front; i <= rear; i++){
            	System.out.println(queue[i]+" ");
        	}
        }
    }
}