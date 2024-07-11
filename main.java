1.TAKE INPUT OF THE NAMES  AND DISPLAY THEM ON THE SCREEN
2.Find the maximum & minimum number in an array of integers. 
3.Take an array of numbers as input and check if it is an array sorted in ascending order.









import java.util.Scanner;
import java.io.*;
class Arrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for(int i=0;i<n;i++){
        arr[i] = sc.next();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
       
    }


}










import java.util.Scanner;
import java.io.*;
class Arrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            
        }
        System.out.println("max is : " +max + " min is :"+ min);
        
    }
    
}

















import java.util.Scanner;
import java.io.*;
class Arrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        int c=0;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                c++;
            }
     }
        if(c!=0){
                System.out.println("not sorted in ascending order");
            }else{
         System.out.println(" sorted in ascending order");
            }
        
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        