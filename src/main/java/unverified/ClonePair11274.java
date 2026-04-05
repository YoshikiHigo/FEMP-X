package unverified;

public class ClonePair11274 {

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

    int method2(int[] array,int value){
      int low=0;
      int high=array.length - 1;
      while (low <= high) {
        int mid=(low + high) >> 1;
        int bci=array[mid];
        if (bci == value) {
          return mid;
        }
        if (bci > value) {
          high=mid - 1;
        }
     else {
          low=mid + 1;
        }
      }
      return -1;
    }
}
