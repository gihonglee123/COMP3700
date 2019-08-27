public class Finder {
    public int max;
    public int min;
    // two functions: findMax(int[] intArray) and findMin(int[] intArray). Those functions, respectively,
    // return the max or min number of the input array.
    // They would also return null in case the input array is null or empty.  (+1)
    public Integer findMax(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            return null;
        }
        else {
            max = intArray[0];
        for(int i = 0; i < intArray.length; i++) {
            int temp;
            temp = intArray[i];
            if (max < temp) {
            max = temp;
            }
        }
        }
        return max;
    }

    public Integer findMin(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            return null;
        }
        else {
            min = intArray[0];
            for(int i = 0; i < intArray.length; i++) {
                int temp;
                temp = intArray[i];
                if (min > temp) {
                    min = temp;
                }
            }
        }
        return min;
    }
    public static void main(String[] args) {
        //int a[] = {9,8,7,6,5,4,4,3,3,2,1};
        //int a[] = null;
        int a[] = {};
        Finder ob = new Finder();
        System.out.println(ob.findMax(a));


    }



}
