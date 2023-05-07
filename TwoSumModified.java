import java.util.*;   

class TwoSumModified {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int out = target - nums[i];

                if(nums[j] == out){
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No Match Found");
    }
    public static void main(String[] args){
        TwoSum a=new TwoSum();
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter Number Of Element You Want to enter in Array : "); 
        int n=sc.nextInt();
        System.out.println("Start Entering Numbers ");

        int myArray[] = new int[n];

        for(int i=0; i<n; i++){
            myArray[i] = sc.nextInt();
        }

        System.out.print("Enter Your Target : ");

        int target=sc.nextInt();
         
        int[] ans=a.twoSum(myArray,target);
        System.out.println(Arrays.toString(ans)); 
    }
}