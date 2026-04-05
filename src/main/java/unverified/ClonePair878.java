package unverified;

public class ClonePair878 {

    boolean method1(byte[] one,byte[] two){
      if (one.length != two.length)   return false;
     else {
        for (int x=0; x < one.length; x++) {
          if (one[x] != two[x])       return false;
        }
      }
      return true;
    }

    boolean method2(byte[] a,byte[] b){
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; ++i)   if (a[i] != b[i])   return false;
      return true;
    }
}
