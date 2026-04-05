package all;

public class ClonePair5535 {

    int method1(int f,int[] s){
      int low=0;
      int high=s.length - 1;
      int mid;
      while (low <= high) {
        mid=(low + high) / 2;
        if (s[mid] > f) {
          high=mid - 1;
        }
     else     if (s[mid] < f) {
          low=mid + 1;
        }
     else {
          return mid;
        }
      }
      return -1;
    }

    int method2(int key,int[] a){
      int lo=0;
      int hi=a.length - 1;
      while (lo <= hi) {
        int mid=lo + (hi - lo) / 2;
        if (key < a[mid])     hi=mid - 1;
     else     if (key > a[mid])     lo=mid + 1;
     else     return mid;
      }
      return -1;
    }
}
