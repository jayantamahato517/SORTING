public class smallestElement {
    public static void findSmallestElement(int arr[], int start, int end){
        if(start >= end){
            return;
        }
        int mid = start + (end - start)/2;

        findSmallestElement(arr, start, mid);
        findSmallestElement(arr, mid + 1, end);

        mergeFind(arr,start,mid,end);
    }
    public static void mergeFind(int arr[], int start, int mid, int end){
        int temp[] = new int[end - start + 1];

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
        for(k=0, i = start; i <= end; i++, k++){
            arr[i] = temp[k];
        }
    }
        public static int findSmallest(int arr[]){
        findSmallestElement(arr, 0, arr.length-1);
        return arr[0];
    }
    public static void main(String[] args) {
        
        int arr[] = {5,4,2,4,5,6};

        int smallest = findSmallest(arr);
        System.out.println("Smallest element: " + smallest);
    }
}
