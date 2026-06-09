public class largestElement {
    public static void findLargestElement(int arr[], int start, int end){
        if(start >= end){
            return;
        }
        int mid = start + (end - start)/2;

        findLargestElement(arr, start, mid);
        findLargestElement(arr, mid + 1, end);

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
        public static int findlargest(int arr[]){
        findLargestElement(arr, 0, arr.length-1);
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        
        int arr[] = {5,4,2,1};

        int largest = findlargest(arr);
        System.out.println("Largest element: " + largest);
    }
}
