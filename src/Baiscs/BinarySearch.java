package Baiscs;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int A[]= new int[n];
        for(int i=0;i<n;i++){
            A[i] = s.nextInt();
        }
        int m = s.nextInt();
        int result = binarySearch(A,m);
        if (result == -1)
            System.out.println(-1);
        else
            System.out.println(result);
    }
        public static int binarySearch(int A[], int m)
        {
            int start=0, end=A.length-1;
            while (start<=end) {
                int mid = start+(end-1) / 2;


                if (A[mid] == m)
                    return mid;


                if (A[mid] < m)
                    start = mid+1;

                else
                    end = m - 1;
            }

            return -1;
        }


    }
