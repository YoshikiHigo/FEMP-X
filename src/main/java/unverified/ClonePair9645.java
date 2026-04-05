package unverified;

public class ClonePair9645 {

    boolean method1(char[] array1,char[] array2){
      boolean equal=false;
      if (array1 == array2) {
        equal=true;
      }
     else   if ((array1 != null) && (array2 != null)) {
        int length=array1.length;
        if (length == array2.length) {
          equal=true;
          for (int i=0; i < length; i++) {
            if (array1[i] != array2[i]) {
              equal=false;
              break;
            }
          }
        }
     else {
          equal=false;
        }
      }
     else {
        equal=false;
      }
      return equal;
    }

    boolean method2(char[] first,char[] second){
      if (first == second)   return true;
      if (first == null || second == null)   return false;
      if (first.length != second.length)   return false;
      for (int i=first.length; --i >= 0; )   if (first[i] != second[i])   return false;
      return true;
    }
}
