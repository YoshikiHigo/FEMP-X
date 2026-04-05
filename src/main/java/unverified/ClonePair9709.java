package unverified;

public class ClonePair9709 {

    boolean method1(char[] o1,char[] o2){
      if (o1 == o2) {
        return true;
      }
      if (o1 == null || o2 == null) {
        return false;
      }
      int length=o1.length;
      if (length != o2.length)   return false;
      for (int index=0; index < length; index++) {
        if (!(o1[index] == o2[index])) {
          return false;
        }
      }
      return true;
    }

    boolean method2(char[] a,char[] b){
      if (a == b)   return true;
      if ((a == null) || (b == null))   return false;
      int i=a.length;
      if (b.length != i)   return false;
      while (--i >= 0)   if (a[i] != b[i])   return false;
      return true;
    }
}
