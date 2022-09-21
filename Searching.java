public class Searching {
    public static int binarySearch(int[] array, int target) {

        int low = 0;
        int high = array.length - 1;

        while(low <= high) {

            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println("middle: " + value);

            if(value < target) low = middle + 1;
            else if(value > target) high = middle - 1;
            else return middle; //target found
        }

        return -1;
    }
    public static int interpolationSearch(int[] array, int value) {
        int low=0;
        int high=array.length-1;

        while(value >= array[low] && value <= array[high] && low <= high){

            int probe = low + (high - low) * (value - array[low]) /
                    (array[high] - array[low]);
            System.out.println("probe number is"+probe);
            if(array[probe]==value){
                return probe;

            }else if(array[probe]<value){
                low=probe+1;

            }else {
                high = probe - 1;
            }

        }


        return -1;
    }
}
