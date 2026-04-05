package unverified;

public class ClonePair4128 {

    boolean method1(String[] s1,String[] s2){
      boolean equal=true;
      int index=0;
      if (s1.length == s2.length) {
        while ((index < s1.length) && (equal)) {
          if (s1[index].equals(s2[index])) {
            index++;
          }
     else {
            equal=false;
          }
        }
        if (index == s1.length)     return true;
     else     return false;
      }
     else {
        return false;
      }
    }

    boolean method2(String[] a1,String[] a2){
      if (a1.length != a2.length)   return (false);
      for (int i=0; i < a1.length; i++) {
        if (!a1[i].equals(a2[i]))     return (false);
      }
      return (true);
    }
}
