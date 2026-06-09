class jay{
    public static void mergeSortPrintAfterMerge(int arr[], int start, int end){
        if(start >= end){
            return;
        }
        int mid = start + (end - start)/2;

        mergeSortPrintAfterMerge(arr, start, mid);
        mergeSortPrintAfterMerge(arr, mid+1, end);

        mergejay(arr,start,mid,end);
    }
    public static void mergejay(int arr[], int start, int mid, int end){
        int temp[] = new int[end - start +1];

        int count = 0;

        int i = start;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= end){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            } else {
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
        for(k=0,i=start; k<temp.length;i++,k++){
            arr[i] =temp[k];
        }
        System.out.print("After merging (" + start + "," + end + ") : ");
        printjay(arr);
    }
    public static void printjay(int arr[]){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {4,3,6,8,2};

        System.out.print("Original array: ");
        printjay(arr);

        mergeSortPrintAfterMerge(arr, 0, arr.length-1);
        
        System.out.print("Final sorted array : ");
        printjay(arr);
    }
}