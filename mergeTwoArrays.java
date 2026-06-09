public class mergeTwoArrays{
    public static int[] mergeTwoArrays(int arr1[], int arr2[]){
        int n1 = arr1.length;
        int n2 = arr2.length;

        int result[] = new int[n1 + n2];

        int i=0,j=0,k=0;

        while(i < n1 && j < n2){
            if(arr1[i] <= arr2[j]){
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i < n2){
            result[k] = arr1[i];
            i++;
            k++;
        }
        while(j < n2){
            result[k] = arr2[j];
            j++;
            k++;
        }
        return result;
    }
    public static void main(String[] args) {
        int arr1[] = {1,3,5,7};
        int arr2[] = {2,4,6,8};

        int merged[] = mergeTwoArrays(arr1, arr2);

        System.out.println("Sorted array: ");
        
        for(int num : merged){
            System.out.println(num);
        }
    }
}