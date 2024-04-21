public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {5, 2, 9, 1, 5, 6};
        selectionSort(arr);
        System.out.println("Sorted array using Selection Sort:");
        printArray(arr);
    }
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
