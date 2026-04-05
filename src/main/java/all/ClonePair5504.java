package all;

public class ClonePair5504 {

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

    int method2(int f,int[] s){
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
}
