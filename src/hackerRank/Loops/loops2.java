package hackerRank.Loops;

import java.util.*;
import java.io.*;
import java.lang.Math;

class loops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int i,j;
        for(i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int p=1;
            int u=p*b;
            for(j=0;j<n;j++) {

                int temp=a+u;
                System.out.printf("%d ",temp);
                p=p*2;
                u=u+p*b;
            }
            System.out.printf("\n");
        }
        in.close();


    }
}