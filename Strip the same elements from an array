package itheima.com;
import java.util.*;

// Double pointer method

public class helloworld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10};

        Random r = new Random();
        int a = 0;
        int b = 0;
        
        while (a < arr.length&&b < arr.length){
            if(arr[a] == arr[b]){
                b++;
            }
            else{
                a++;
                arr[a]=arr[b];
                b++;
            }
        }

            for (int i = 0; i <= a; i++) {
                System.out.print(arr[i]+" ");
            }
    }
}


