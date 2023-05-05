import java.util.Scanner;
public class encrypt{
	public static void main(String[] args) {
		Scanner scString=new Scanner(System.in);
		System.out.println("Enter The Message You Want To Encrpt : ");
		String myMsg = scString.nextLine();
		for(int i=0;i<myMsg.length();i++){
			char temp=myMsg.charAt(i);
			short tempEn=(short)temp;
			tempEn++;
			char newTemp=(char)tempEn;
			System.out.print(newTemp);
		}
	}
}