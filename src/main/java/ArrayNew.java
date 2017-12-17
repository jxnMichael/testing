import java.util.Random;
import java.util.Scanner;

/**
 * Created by Михаил on 14.12.2017.
 */
public class ArrayNew {

    public static int[] sort(){

        int a[] = {2,3,4,1,7,9,8,6,5,0};

        int N=10;

        int i, j, c;

        for(i=0;i<N-1;i++) {

            for (j=N-2;j>=i;j--) {

                if (a[j] > a[j + 1]) {

                    c = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = c;
                }

            }
        }

        for(i=0;i<N;i++) {

            System.out.print(a[i]+" ");
        }


        System.out.println("");

   return a;

    }



    public static void main(String[] args) {

       sort();

    }
}
