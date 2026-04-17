package itheima.com;
import java.util.*;



public class helloworld {
public static int sum(int a, int b){
    return a+b;
}
public static boolean ispirme(int a,int[]arr){
    for(int i=0;i<arr.length;i++){
        if(a==arr[i]){
            return false;
        }
    }
    return true;

}

    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       Random r=new Random();

     int arr[]=new int[10];
     for(int i=0;i<arr.length;i++){
         int e=r.nextInt(1,101);
         if (ispirme(e,arr)){
             arr[i]=e;
         }

     }
     for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
     }
    }
}


