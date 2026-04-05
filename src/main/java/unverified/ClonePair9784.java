package unverified;

public class ClonePair9784 {

    boolean method1(char[] first,char[] second){
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

    boolean method2(char[] first,char[] second){
      if (first == second)   return true;
      if (first == null || second == null)   return false;
      if (first.length != second.length)   return false;
      for (int i=first.length; --i >= 0; )   if (first[i] != second[i])   return false;
      return true;
    }
}
