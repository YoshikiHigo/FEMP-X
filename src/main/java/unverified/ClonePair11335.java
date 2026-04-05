package unverified;

public class ClonePair11335 {

    int method1(int[] data,int key){
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
