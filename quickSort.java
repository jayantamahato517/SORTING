class main{
    public static void quickSort(int arr[], int start, int end){

        //base case
        if(start >= end){
            return;
        }
        //places the pivot in its correct position and returns its index
        int pivotIndex = partition(arr,start,end);

        //sort left side
        quickSort(arr, start, pivotIndex-1);
        //sort right side
        quickSort(arr, pivotIndex+1, end);
    }
    public static int partition(int arr[], int start, int end){

        //choose the last element as pivot
        int pivot = arr[end];

        int i = start - 1; // i starts with -1

        //traverse the array
        for(int j = start ; j<end; j++){

            //if current element is smaller than pivot : move it to the left side
            if(arr[j] < pivot){

                //increase smaller element boundary
                i++;

                //swap elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //after loop, move i one step ahead
        i++;

        //place pivot in correct position
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        //return pivot index
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};

        //function call
        quickSort(arr, 0, arr.length-1);

        System.out.print("Sorted array : ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}