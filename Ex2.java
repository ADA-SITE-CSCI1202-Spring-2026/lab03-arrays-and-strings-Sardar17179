public class Ex2 {
    public static int minValue(int[] arr) {
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;

    }
    public static int maxValue(int[] array){
        int max = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
    public static int[] both(int[] array){
        int max=array[0];
        int min=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
            if(array[i]<min){
                min = array[i];
            }
        }
        return new int[]{max,min};
    }

}