import java.util.*;
class IdentifyEven_Prog7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for(int i=0;i<5;i++){
             nums[i] = sc.nextInt();
        }
        System.out.print("The 5 numbers are : ");
        for(int i=0;i<5;i++){
            System.out.print(nums[i] + " ");
        }
        
        System.out.print("\nThe even numbers are : ");

        for(int i=0;i<5;i++){
            if(nums[i]%2 == 0){
                System.out.print(nums[i] + " ");
            }
        }



    }
}