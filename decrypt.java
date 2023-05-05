import java.util.Scanner;
public class decrypt{
	public static void main(String[] args) {
		Scanner scString=new Scanner(System.in);
		System.out.println("Note : Code Encrypted by above code would only be decrypted properly ");
		System.out.println("Enter The Message You Want To decrypt : ");
		String myMsg = scString.nextLine();
		for(int i=0;i<myMsg.length();i++){
			char temp=myMsg.charAt(i);
			short tempEn=(short)temp;
			tempEn--;
			char newTemp=(char)tempEn;
			System.out.print(newTemp);
		}
	}
}