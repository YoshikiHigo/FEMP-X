package unverified;

public class ClonePair9717 {

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

    boolean method2(char[] c1,char[] c2){
      if (c1 == null)   return c2 == null;
      if (c2 == null)   return false;
      if (c1.length != c2.length)   return false;
      for (int i=0; i < c1.length; i++) {
        if (c1[i] != c2[i])     return false;
      }
      return true;
    }
}
