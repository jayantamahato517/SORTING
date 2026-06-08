class mergeSort{
    public static void mergeSort(int arr[],int start, int end){

        if(start >= end){
            return;
        }
        //find mid
        int mid = start + (end - start)/2;

        //sort left part
        mergeSort(arr, start, mid);

        //sort right part
        mergeSort(arr, mid+1, end);

        merge(arr,start,mid,end);
    }
    public static void merge(int arr[], int start, int mid, int end){
        int temp[] = new int[end - start + 1];

        int i = start;     //left half pointer
        int j = mid + 1;  //right half pointer
        int k = 0;       //temp array pointer

        while(i <= mid && j <= end){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j <= end){
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(i = start, k=0; i<=end; i++, k++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {

        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);

        System.out.println("Sorted array is : ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}