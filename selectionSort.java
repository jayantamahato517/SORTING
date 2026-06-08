public class selectionSort {
    public static void SelectionSort(int arr[]){

        for(int i=0; i<arr.length-1; i++){
            int minIndex = i;

            for(int j=i+1; j<arr.length; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,1,5};
        SelectionSort(arr);
        printArr(arr);
    }
}
