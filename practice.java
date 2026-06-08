class main{
    public static void quickSo(int arr[], int start, int end){
        if(start >= end){
            return;
        }
        int pivotIndex = partition(arr,start,end);

        quickSo(arr, start, pivotIndex-1);
        quickSo(arr, pivotIndex+1, end);
    }
    public static int partition(int arr[], int start, int end){
        int pivot = arr[end];
        int i = start - 1;

        for(int j= start; j < end; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,6,1};
        quickSo(arr, 0, arr.length-1);

        System.out.print("Sorted array is: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}