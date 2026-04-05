package all;

public class ClonePair4737 {

    int method1(String[] a,String key,int from,int to){
      int low=from;
      int high=to;
      for (; low <= high; ) {
        int mid=(low + high) >> 1;
        String midVal=a[mid];
        if (midVal.compareTo(key) < 0)     low=mid + 1;
     else     if (midVal.compareTo(key) > 0)     high=mid - 1;
     else {
          int pos=mid - 1;
          while (pos >= from && a[pos] == key) {
            pos--;
          }
          return pos + 1;
        }
      }
      return -(low + 1);
    }

    int method2(String[] strings,String key,int from,int to){
      int low=from;
      int high=to;
      for (; low <= high; ) {
        int mid=(low + high) >> 1;
        String midVal=strings[mid];
        if (midVal.compareTo(key) < 0)     low=mid + 1;
     else     if (midVal.compareTo(key) > 0)     high=mid - 1;
     else     return mid;
      }
      return -(low + 1);
    }
}
