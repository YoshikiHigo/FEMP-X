package all;

public class ClonePair5505 {

    int method1(int f,int[] s){
      int low=0;
      int high=s.length - 1;
      int mid;
      while (low <= high) {
        mid=(low + high) >>> 1;
        if (s[mid] > f) {
          high=mid - 1;
        }
     else     if (s[mid] < f) {
          low=mid + 1;
        }
     else     return mid;
      }
      return -1;
    }

    int method2(int value,int[] array){
      for (int i=array.length; --i >= 0; ) {
        if (array[i] == value) {
          return i;
        }
      }
      return -1;
    }
}
