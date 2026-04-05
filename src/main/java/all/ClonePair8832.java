package all;

public class ClonePair8832 {

    int method1(short[] a,short key){
      int low=0;
      int high=a.length - 1;
      while (low <= high) {
        int mid=(low + high) / 2;
        short midVal=a[mid];
        if (midVal < key)     low=mid + 1;
     else     if (midVal > key)     high=mid - 1;
     else     return mid;
      }
      return -(low + 1);
    }

    int method2(short[] a,short key){
      int low=0;
      int hi=a.length - 1;
      int mid=0;
      while (low <= hi) {
        mid=(low + hi) >> 1;
        final short d=a[mid];
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
