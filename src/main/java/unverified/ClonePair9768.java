package unverified;

public class ClonePair9768 {

    boolean method1(char[] a,char[] b){
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

    boolean method2(char[] o1,char[] o2){
      if (o1 == o2)   return true;
      if (o1 == null || o2 == null)   return false;
      int length=o1.length;
      if (length != o2.length)   return false;
      for (int index=0; index < length; index++) {
        if (!(o1[index] == o2[index]))     return false;
      }
      return true;
    }
}
