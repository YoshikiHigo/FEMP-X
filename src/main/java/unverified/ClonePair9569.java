package unverified;

public class ClonePair9569 {

    boolean method1(char[] ch1,char[] ch2){
      if (ch1 == null) {
        if (ch2 == null) {
          return true;
        }
     else {
          return false;
        }
      }
     else   if (ch2 == null) {
        return false;
      }
      if (ch1.length != ch2.length)   return false;
      for (int i=0; i < ch1.length; i++) {
        if (ch1[i] != ch2[i])     return false;
      }
      return true;
    }

    boolean method2(char[] first,char[] second){
      if (first == second) {
        return true;
      }
      if (first == null || second == null) {
        return false;
      }
      if (first.length != second.length) {
        return false;
      }
      for (int i=first.length; --i >= 0; ) {
        if (first[i] != second[i]) {
          return false;
        }
      }
      return true;
    }
}
