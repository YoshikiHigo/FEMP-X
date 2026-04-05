package all;

public class ClonePair4082 {

    boolean method1(String[] groupSet0,String[] groupSet1){
      if (groupSet0.length != groupSet1.length)   return false;
      iLoop:   for (int i=0; i < groupSet0.length; i++) {
        for (int j=0; j < groupSet1.length; j++) {
          if (groupSet0[i].equals(groupSet1[j])) {
            continue iLoop;
          }
        }
        return false;
      }
      return true;
    }

    boolean method2(String[] s1,String[] s2){
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
}
