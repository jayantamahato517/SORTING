public class secondLargest {
    public static void secondLargest(int arr[], int start, int end){
        if(start >= end){
            return;
        }
        int mid = start + (end - start) / 2;

        secondLargest(arr, start, mid);
        secondLargest(arr, mid + 1, end);

        mergeArray(arr, start, mid, end);
    }
    public static void mergeArray(int arr[], int start, int mid, int end){
        int temp[] = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k =0;

        while(i < mid && j < end){
            if(arr[i] <= arr[j]){
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
        for(i=start, k=0; i<= end; i++,k++){
            arr[i] = temp[k];
        }
    }
    public static int findSecondLargest(int arr[]){
        secondLargest(arr, 0, arr.length-1);

        return arr[arr.length-2];
    }
    public static void main(String[] args) {
        int arr[] = {5,7,6,2,1};

        int secLargest = findSecondLargest(arr);

        System.out.println("Second largest: " + secLargest);
    }
}
