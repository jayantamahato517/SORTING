public class optimalBubbleSort {
    public static void OptBubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            boolean swapped = false;

            for(int j=0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,2,15,543,1};
        OptBubbleSort(arr);
        System.out.println("Sorted array : ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
