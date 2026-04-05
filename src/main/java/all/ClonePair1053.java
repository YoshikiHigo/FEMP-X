package all;

public class ClonePair1053 {

    int method1(Object[] array,Object object){
      if (array.length == 0) {
        return -1;
      }
      int low=0, mid=0, high=array.length - 1, result=0;
      while (low <= high) {
        mid=(low + high) >>> 1;
        if ((result=((Comparable)array[mid]).compareTo(object)) < 0) {
          low=mid + 1;
        }
     else     if (result == 0) {
          return mid;
        }
     else {
          high=mid - 1;
        }
      }
      return -mid - (result >= 0 ? 1 : 2);
    }

    int method2(Object[] a,Object key){
      int low=0;
      int high=a.length - 1;
      while (low <= high) {
        int mid=(low + high) / 2;
        Object midVal=a[mid];
        int cmp=((Comparable)midVal).compareTo(key);
        if (cmp < 0)     low=mid + 1;
     else     if (cmp > 0)     high=mid - 1;
     else     return mid;
      }
      return -(low + 1);
    }
}
