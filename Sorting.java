public class Sorting {
    public static int bubbleSort(int[] array) {
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }

        }
        return -1;
    }


    public static void selectionSort(int[] array)
    {
        for(int i=0;i<array.length-1;i++){
            int min=i;
            for(int j=i+1;j<array.length;j++){
                if(array[min]>array[j]){
                    min=j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }
    }
    public static void insertionSort(int[] array) {

        for(int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
    public static void mergeSort(int[] numbers) {
        int inputLen=numbers.length;
        if(inputLen<2) return;
        int midIndex=inputLen/2;
        int[] leftHalf=new int[midIndex];
        int[] rightHalf=new int[inputLen-midIndex];
        for(int i=0;i<midIndex;i++){
            leftHalf[i]=numbers[i];
        }
        for(int i=midIndex;i<inputLen;i++){
            rightHalf[i-midIndex]=numbers[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        //merge
        merge(numbers,leftHalf,rightHalf);
    }

    public static void merge(int[] inputLen, int[] leftHalf, int[] rightHalf) {
        int leftSize=leftHalf.length;
        int rightSize=rightHalf.length;
        int l=0,r=0,t=0;//left-right-total
        while(l<leftSize && r<rightSize){
            if(leftHalf[l]<=rightHalf[r]){
                inputLen[t]=leftHalf[l];
                l++;
            }else{
                inputLen[t]=rightHalf[r];
                r++;
            }
            t++;
        }
        while(l<leftSize){
            inputLen[t]=leftHalf[l];
            l++;
            t++;


        }
        while(r<rightSize){
            inputLen[t]=rightHalf[r];
            r++;
            t++;

        }
    }



    private static void swap(int[] numbers, int index1, int index2) {
        int temp=numbers[index1];
        numbers[index1]=numbers[index2];
        numbers[index2]=temp;
    }

    public static void quickSort(int[] array, int start, int end) {

        if(end <= start) return;

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }
    private static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;

        for(int j = start; j <= end; j++) {
            if(array[j] < pivot) {
                i++;
                swap(array,i,j);
            }
        }
        i++;
        swap(array,i,end);

        return i;
    }
    public static void printNum(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

    }
}
