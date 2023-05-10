import java.util.Scanner;
public class BinarySearch{
	public static void main(String[] args) {
		int[] myArray = {2,3,5,6,7,9,11,13,18,29,65} ; 

		Scanner sc = new Scanner ( System.in ) ;

		System.out.print("Enter The Number you want to search : ") ;
		int searchNumber = sc.nextInt() ;
		sc.close() ;

		int low = 0 ;
		int high = myArray.length - 1 ;
		boolean isFound = false ;

		while ( high >= low ) {
			int mid = ( high + low ) / 2 ;
			if ( searchNumber < myArray[mid] ){
				high = mid - 1 ;
			}
			else if ( searchNumber == myArray[mid] ) {
				System.out.println("Found at(index) = " + mid) ;
				isFound = true ;
				break ;
			}
			else {
 				low = mid + 1 ;
			}
		}
		if ( !isFound ) {
			System.out.println("Number does not exist in Array") ;
		}
	}
}