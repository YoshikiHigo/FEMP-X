package unverified;

public class ClonePair9720 {

    boolean method1(char[] arr1,char[] arr2){
      if (arr1 == arr2)   return true;
      if (arr1 != null && arr2 != null && arr1.length == arr2.length) {
        for (int i=arr1.length; i-- > 0; )     if (arr1[i] != arr2[i])     return false;
        return true;
      }
      return false;
    }

    boolean method2(char[] a,char[] b){
      if (null == a) {
        if (null == b)     return true;
     else     return false;
      }
     else   if (null == b)   return false;
     else {
        if (a.length == b.length) {
          for (int cc=0, count=a.length; cc < count; cc++) {
            if (a[cc] != b[cc])         return false;
          }
          return true;
        }
     else     return false;
      }
    }
}
