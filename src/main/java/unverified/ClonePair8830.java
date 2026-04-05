package unverified;

public class ClonePair8830 {

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
      int high=a.length - 1;
      while (low <= high) {
        int mid=(low + high) >> 1;
        short midVal=a[mid];
        if (midVal < key)     low=mid + 1;
     else     if (midVal > key)     high=mid - 1;
     else     return mid;
      }
      return -(low + 1);
    }
}
