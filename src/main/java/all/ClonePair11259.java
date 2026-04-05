package all;

public class ClonePair11259 {

    int method1(int[] a,int key){
      int low=0;
      int high=a.length - 1;
      while (low <= high) {
        int mid=(low + high) / 2;
        int midVal=a[mid];
        if (midVal < key)     low=mid + 1;
     else     if (midVal > key)     high=mid - 1;
     else     return mid;
      }
      return -(low + 1);
    }

    int method2(int[] a,int key){
      int low=0;
      int hi=a.length - 1;
      int mid=0;
      while (low <= hi) {
        mid=(low + hi) >> 1;
        final int d=a[mid];
        if (d == key) {
          return mid;
        }
     else     if (d > key) {
          hi=mid - 1;
        }
     else {
          low=++mid;
        }
      }
      return -mid - 1;
    }
}
