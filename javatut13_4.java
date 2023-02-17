import java.net.SocketTimeoutException;

// import java.util.*;
public class javatut13_4 {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int arr[]=new int [5];
        // int item=10;
        // for (int i=0;i<arr.length;i++){
        // arr[i]=sc.nextInt();
        // }
        // for (int i=0;i<arr.length;i++){
        // System.out.println( arr[i]);
        // }
        // int index= linearsearch(arr, item);
        // if (index==-1){
        // System.out.println("not found");
        // }
        // else{
        // System.out.println("index="+index);
        // }

        // -------------------------------------
        int arr2[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int arr1[] = { 3, 5, 6, 7, 9, 11, 13 };
        int item1 = 10;
        int largest = Integer.MIN_VALUE;// - infinity
        int smallest = Integer.MAX_VALUE;
        largestno(arr1, largest, smallest);
        System.out.println(binarysearch(arr1, item1));
        System.out.println("The reverse of  an array arr1 is:");
        rev_anarray(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(" " + arr1[i]);
        }
        System.out.println();
        System.out.println("Pairs in an array arr1 is:");
        pair_inarray(arr1);
        System.out.println("Printing sub array");
        subarray(arr1);
        subarray_max_sum(arr1);
        maxSubarraySum(arr1);
        kadanes(arr2);
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedrainwater(height));
        int prices[]={ 7,1,5,3,6,4};
        System.out.println("Max profit ="+buy_sellstocks(prices));

    }
    // public static int linearsearch(int arr[], int item){
    // for (int i=0;i<arr.length;i++){
    // if (arr[i]==item){
    // return i;
    // }

    // }return -1;
    // }

    public static void largestno(int arr1[], int largest, int smallest) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > largest) {
                largest = arr1[i];
            }
            if (arr1[i] < smallest) {
                smallest = arr1[i];
            }
        }
        System.out.println("largest no=" + largest);
        System.out.println("smallest no=" + smallest);
    }

    public static int binarysearch(int arr1[], int item1) {
        int start = 0;
        int end = arr1.length - 1;
        while (start <= end) { 
            int mid = (start + end) / 2;
            if (item1 == arr1[mid]) {
                return mid;
            } else if (item1 > arr1[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void rev_anarray(int arr1[]) {
        int start = 0;
        int end = arr1.length - 1;
        while (start < end) {
            int temp = arr1[end];
            arr1[end] = arr1[start];
            arr1[start] = temp;
            start++;
            end--;

        }
    }

    public static void pair_inarray(int arr1[]) {
        int tp = 0;
        for (int i = 0; i < arr1.length; i++) {
            int curr = arr1[i];
            for (int j = i + 1; j < arr1.length; j++) {
                System.out.print("(" + curr + "," + arr1[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs are = " + tp);
    }

    public static void subarray(int arr1[]) {
        int ts = 0;
        for (int i = 0; i < arr1.length; i++) {
            int start = i;
            for (int j = i; j < arr1.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr1[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(ts);
    }

    public static void subarray_max_sum(int arr1[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            int start = i;
            for (int j = i; j < arr1.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) {
                    sum = sum + arr1[k];
                    if (sum > max) {
                        max = sum;
                    }
                    if (sum < min) {
                        min = sum;
                    }
                }

            }

        }
        System.out.println("Maximum sum is " + max);
        System.out.println("Minimum sum is " + min);

    }

    public static void maxSubarraySum(int arr1[]) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int prefix[] = new int[arr1.length];
        prefix[0] = arr1[0];
        // calculate prefix arrray
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr1[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            int start = i;
            for (int j = i; j < arr1.length; j++) {
                int end = j;
                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println("Maximum sum is " + max);
    }

    public static void kadanes(int arr2[]) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum = sum + arr2[i];
            if (sum < 0) {
                sum = 0;
            }
            max = Math.max(sum, max);
        }
        System.out.println("our max sub array  sum is " + max);
    }

    public static int trappedrainwater(int height[]) {
        int n = height.length;
        // calculate left max boundary-array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        // calculate right max boundary-array
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        int trappedwater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            // trapped water +=waterlevel-height[i]
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;
        // waterlevel=min (leftmax bound, rightmax bound)
    }
    public  static int buy_sellstocks(int prices[]){
        int buyprice =Integer.MAX_VALUE;
        int maxprofit =0;
        for (int i=0; i<prices.length;i++){
            if (buyprice <prices[i]){
                int profit=prices[i]-buyprice;
                maxprofit =Math.max(maxprofit,profit);
            }else{
                buyprice=prices[i];
            }
        }return maxprofit;
    }
    
}
