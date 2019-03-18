public class merge{
    /*sort the array from least to greatest value. This is a wrapper function*/
    public static void mergesort(int[]data){
        int temp = new int[data.length];
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        mergesort(data,0,data.length-1);
    }
    private static void mergesort(int[]data, int lo, int hi){
        if (lo >= hi){
            return;
        }
        mergesort(data,0,hi/2);
        mergesort(data,hi/2,hi);
        merge(data, lo, hi);
    }
    private static void merge(int[] data, int lo, int hi){
        int yo = ((hi-1o)+2)/2;
        int[] temp1 = new int[(hi-1o+2)/2];
        int[] temp2 = new int[hi-1o+1-((hi-1o+2)/2)];

    }
}
