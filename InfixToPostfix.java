import java.util.*;
public class InfixToPostfix{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Infix Expresion : ");
		String str = sc.nextLine();
		String ans = convertToPostFix(str);
		System.out.print("Postfix Expresion : "+ans);		
	}
	static String convertToPostFix(String str){
		String postfix = " ";
		Stack<Character> stack = new Stack<Character>();
		stack.push('(');
		str += ')';
		int rank = 0;
		for(char i : str.toCharArray()){
			if(Character.isLetterOrDigit(i)){
				postfix += i + " ";
				rank++;
			}
			else if(i == '('){
				stack.push(i);
			}
			else if(i == ')'){
				while(!stack.empty() && stack.peek() != '('){
					postfix += stack.pop() + " ";
				}
				if(stack.empty() || stack.peek() != '('){
					return "Invalid Input String ";
				}
				else{
					stack.pop();
				}
			}
			else if(isOperator(i)){
				rank--;
				if(i == '^' || i == '$'){
					stack.push(i);
				}
				else{
					while(!stack.empty() && getPrecedence(i) <= getPrecedence(stack.peek())){
						postfix += stack.pop() + " ";
					}
					stack.push(i);
				}
			}
		}
		if(rank != 1){
			return "Invalid Input String";	
		}
		return postfix;
	}
	static int getPrecedence(char ch){
		switch(ch){
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 3;
			case '^':
			case '$':
				return 6;
		}
		return -1;
	}
	static boolean isOperator(char ch){
		return ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^'||ch=='$';
	}
}