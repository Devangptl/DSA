class BacktrakingOnArray {

    public static void changArr(int arr[], int idx , int value){
        //base case
        if(idx == arr.length){
            printArr(arr);
            return;
        }
        //recursion

        arr[idx] = value;
        changArr(arr, idx +1, value +1);
        
        // backtraking step
        arr[idx] = arr[idx] -2 ; 
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]  = new int[5];

        changArr(arr, 0, 1);

        printArr(arr);
    }
}