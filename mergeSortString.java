public class mergeSortString {
    public static void mergeSort(char arr[], int start, int end){
        if(start >= end){
            return;
        }
        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        merge(arr,start,mid,end);
    }
    public static void merge(char arr[], int start, int mid, int end){
        char temp[] = new char[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= end){
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
        for(k=0, i = start ; k < temp.length;k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        String str = "jayanta";

        char arr[] = str.toCharArray();

        mergeSort(arr, 0, arr.length-1);

        String sorted = new String(arr);
        System.out.println("Sorted string: " + sorted);


    }
}
