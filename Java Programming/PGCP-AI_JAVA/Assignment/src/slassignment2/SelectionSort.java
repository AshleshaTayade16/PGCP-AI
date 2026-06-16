package slassignment2;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int []arr=new int[n];

        System.out.println("Enter elements:");
        for (int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num+" ");
        }

        sc.close();
    }
}
