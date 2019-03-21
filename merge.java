public class merge{
    public static void main(String[] args) {
        int[] test = new int[]{0,5,2,5,3,5,7,8,1};
        mergesort(test);
        for (int i: test){
            System.out.print(i);
        }
        System.out.println();
        test = new int[]{0,5,2,5,3,5,7,8,1};
        insertionSort(test,0,4);
        for (int i: test){
            System.out.print(i);
        }
    }
    /*sort the array from least to greatest value. This is a wrapper function*/
    public static void mergesort(int[]data){
        mergesort(data,0,data.length-1);
    }
    private static void mergesort(int[]data, int lo, int hi){
        if (lo >= hi){
            return;
        }
        System.out.println(lo + ", " + hi);
        if(hi - lo < 43){
            insertionSort(data,lo,(lo + hi+ 2)/2);
            //System.out.print("crossed");
            insertionSort(data,(lo + hi + 2)/2,hi + 1);
        } else{
            mergesort(data,lo,(lo + hi)/2);
            //System.out.print("crossed");
            mergesort(data,(lo + hi + 2)/2,hi);
        }
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
        for(int i = lo, one = 0, two = 0; i <= hi; i++){
            if (one < temp1.length){
                if (two < temp2.length && temp1[one]>temp2[two]){
                    data[i]=temp2[two];
                    two++;
                }
                else{
                    data[i]=temp1[one];
                    one++;
                }
            }
            else {
                if (one < temp1.length && temp1[one]<temp2[two]){
                    data[i]=temp1[one];
                    one++;
                }
                else {
                    data[i]=temp2[two];
                    two++;
                }
            }
        }
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
