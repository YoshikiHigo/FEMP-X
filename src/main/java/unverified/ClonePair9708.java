package unverified;

public class ClonePair9708 {

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

    boolean method2(char[] a1,char[] a2){
      if (a1 == a2) {
        return true;
      }
      try {
        if (a1.length == a2.length) {
          for (int i=0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
              return false;
            }
          }
          return true;
        }
      }
     catch (  NullPointerException e) {
      }
      return false;
    }
}
