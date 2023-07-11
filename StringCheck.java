import java.util.*;
public class StringCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		boolean ans = StringCheck.isValid(str.toLowerCase());
		if(ans == true){
			System.out.println("String is Pallindrom");
		}
		else{
			System.out.println("String is not Pallindrom");
		}
	}
	static boolean isValid(String str){
		Stack<Character> stc = new Stack<Character>();
		if(!str.contains("c")){
			return false;
		}

		int index = str.indexOf("c");

		for(int i = 0; i < index ; i++){
			stc.push(str.charAt(i));
		}

		for(int i = index+1 ; i < str.length() ; i++){
			if(stc.isEmpty()){
				return false;
			}
			if(stc.pop() != str.charAt(i)){
				return false;
			}
		}
		if(!stc.isEmpty()){
				return false;
		}
		return true;
	}
}