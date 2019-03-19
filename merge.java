public class merge{
    public static void main(String[] args) {

    }
    /*sort the array from least to greatest value. This is a wrapper function*/
    public static void mergesort(int[]data){
        int[] temp = new int[data.length];
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        mergesort(data,0,data.length-1);
    }
    private static void mergesort(int[]data, int lo, int hi){
        if (lo >= hi){
            return;
        }
        mergesort(data,lo,hi/2);
        mergesort(data,hi/2,hi);
        merge(data, lo, hi);
    }
    private static void merge(int[] data, int lo, int hi){
        int yo = ((hi-lo)+2)/2;
        int[] temp1 = new int[(hi-lo+2)/2];
        int[] temp2 = new int[hi-lo+1-((hi-lo+2)/2)];
        for(int i = 0; i < temp1.length; i++){
            temp1[i] = data[lo+i];
        }
        for(int i = 0; i < temp2.length; i++){
            temp2[i] = data[lo+temp1.length + i];
        }
        for()
    }

    public static void insertionSort(int[] data, int lo, int hi){
        int orig;
        for (int x = 1+lo; x < hi; x++){
          orig = data[x];
          for (int y = x; y > 0 && data[y] < data[y-1] ; y--){
              data[y] = data[y-1];
              data[y-1] = orig;
          }
        }
    }

}
