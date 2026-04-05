package all;

public class ClonePair11273 {

    int method1(int[] array,int value){
      int end=array.length - 1;
      int start=0;
      int middle;
      while (start < end) {
        middle=(start + end) / 2;
        if (value > array[middle]) {
          start=middle + 1;
        }
     else     if (value < array[middle]) {
          end=middle - 1;
        }
     else {
          return middle;
        }
      }
      return -1;
    }

    int method2(int[] data,int key){
      int low=0, high=data.length - 1;
      while (low <= high) {
        final int i=(low + high) >> 1;
        final int v=data[i];
        if (v == key)     return i;
     else     if (v < key)     low=i + 1;
     else     high=i - 1;
      }
      return -1;
    }
}
