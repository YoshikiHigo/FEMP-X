package all;

public class ClonePair6812 {

    int method1(Object[] a,int fromIndex,int toIndex,Object key){
      int low=fromIndex;
      int high=toIndex - 1;
      while (low <= high) {
        int mid=(low + high) >>> 1;
        Comparable midVal=(Comparable)a[mid];
        int cmp=midVal.compareTo(key);
        if (cmp < 0) {
          low=mid + 1;
        }
     else     if (cmp > 0) {
          high=mid - 1;
        }
     else {
          return mid;
        }
      }
      return -(low + 1);
    }

    int method2(Object[] a,int fromIndex,int toIndex,Object key){
      int low=fromIndex;
      int high=toIndex - 1;
      while (low <= high) {
        int mid=(low + high) >>> 1;
        Comparable midVal=(Comparable)a[mid];
        int cmp=midVal.compareTo(key);
        if (cmp < 0) {
          low=mid + 1;
        }
     else     if (cmp > 0) {
          high=mid - 1;
        }
     else {
          return mid;
        }
      }
      return -(low + 1);
    }
}
