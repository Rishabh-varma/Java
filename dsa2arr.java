public class dsa2arr {
    public void printarr(int []arr){
        int n= arr.length;
        for(int i=0;i<n; i++){
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args) {
        dsa2arr arrprint=new dsa2arr();
        arrprint.printarr(new int []{5,5,8,8,9});
    }
}
