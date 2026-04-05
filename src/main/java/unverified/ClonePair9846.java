package unverified;

public class ClonePair9846 {

    boolean method1(char[] first,char[] second){
      if (first == second)   return true;
      if (first == null || second == null)   return false;
      if (first.length != second.length)   return false;
      for (int i=first.length; --i >= 0; )   if (first[i] != second[i])   return false;
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
