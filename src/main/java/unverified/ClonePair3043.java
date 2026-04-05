package unverified;

public class ClonePair3043 {

    boolean method1(byte[] first,byte[] second){
      boolean equal=first.length == second.length;
      for (int i=0; i < first.length && equal; i++) {
        equal=first[i] == second[i];
      }
      return equal;
    }

    boolean method2(byte[] a,byte[] b){
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; ++i)   if (a[i] != b[i])   return false;
      return true;
    }
}
