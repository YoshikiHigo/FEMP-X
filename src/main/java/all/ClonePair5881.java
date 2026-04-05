package all;

public class ClonePair5881 {

    int method1(int[] a,int key,int low,int high){
      while (low <= high) {
        int mid=(low + high) >>> 1;
        int midVal=a[mid];
        int cmp;
        cmp=midVal - key;
        if (cmp < 0)     low=mid + 1;
     else     if (cmp > 0)     high=mid - 1;
     else     return mid;
      }
      return -(low + 1);
    }

    int method2(int[] a,int key,int low,int high){
      int currentLow=low;
      int currentHigh=high;
      while (currentLow <= currentHigh) {
        final int mid=currentLow + currentHigh >> 1;
        final int midVal=a[mid];
        if (midVal < key) {
          currentLow=mid + 1;
        }
     else     if (midVal > key) {
          currentHigh=mid - 1;
        }
     else {
          return mid;
        }
      }
      return -(currentLow + 1);
    }
}
