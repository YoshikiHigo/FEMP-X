package unverified;

public class ClonePair13397 {

    boolean method1(byte a[],byte b[]){
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i])     return false;
      }
      return true;
    }

    boolean method2(byte digesta[],byte digestb[]){
      if (digesta.length != digestb.length)   return false;
      for (int i=0; i < digesta.length; i++) {
        if (digesta[i] != digestb[i]) {
          return false;
        }
      }
      return true;
    }
}
