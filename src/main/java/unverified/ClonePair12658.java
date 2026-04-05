package unverified;

public class ClonePair12658 {

    int method1(float[] a,float key,int low,int high){
      while (low <= high) {
        int mid=(low + high) / 2;
        float midVal=a[mid];
        int cmp;
        if (midVal < key) {
          cmp=-1;
        }
     else     if (midVal > key) {
          cmp=1;
        }
     else {
          int midBits=Float.floatToIntBits(midVal);
          int keyBits=Float.floatToIntBits(key);
          cmp=(midBits == keyBits ? 0 : (midBits < keyBits ? -1 : 1));
        }
        if (cmp < 0)     low=mid + 1;
     else     if (cmp > 0)     high=mid - 1;
     else     return mid;
      }
      return -(low + 1);
    }

    int method2(float[] a,float key,int low,int high){
      while (low <= high) {
        int mid=(low + high) >> 1;
        float midVal=a[mid];
        int cmp;
        if (midVal < key) {
          cmp=-1;
        }
     else     if (midVal > key) {
          cmp=1;
        }
     else {
          int midBits=Float.floatToIntBits(midVal);
          int keyBits=Float.floatToIntBits(key);
          cmp=(midBits == keyBits ? 0 : (midBits < keyBits ? -1 : 1));
        }
        if (cmp < 0)     low=mid + 1;
     else     if (cmp > 0)     high=mid - 1;
     else     return mid;
      }
      return -(low + 1);
    }
}
