package unverified;

public class ClonePair865 {

    boolean method1(byte[] one,byte[] two){
      if (one.length != two.length)   return false;
     else {
        for (int x=0; x < one.length; x++) {
          if (one[x] != two[x])       return false;
        }
      }
      return true;
    }

    boolean method2(byte[] tom,byte[] jerry){
      boolean b=true;
      if (tom.length != jerry.length) {
        b=false;
      }
     else {
        for (int i=0; i < tom.length; i++) {
          if (tom[i] != jerry[i]) {
            b=false;
            break;
          }
        }
      }
      return b;
    }
}
