public class countInversions {
    public static int MergeSort(int arr[], int start, int end){
        if(start >= end){
            return 0;
        }
        int mid = start + (end - start) / 2;

        int leftInversion = MergeSort(arr, start, mid);
        int rightInversion = MergeSort(arr, mid + 1, end);
        int mergeInversion = Merge(arr,start,mid,end);

        return leftInversion + rightInversion + mergeInversion;
    }

    public static int Merge(int arr[], int start, int mid, int end){
        int temp[] = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        int count = 0;

        while(i <= mid && j <= end){

            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];

                count += (mid - i +1);
            }
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= end){
            temp[k++] = arr[j++];
        }
        for(k=0, i= start; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
        return count;
    }
    public static void main(String[] args) {
        
        int arr[] = {2,4,1,3,5};

        int inversions = MergeSort(arr, 0, arr.length-1);
        System.out.println("Number of Inversions: " + inversions);
    }
}
