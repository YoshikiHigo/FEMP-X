package all;

public class ClonePair4077 {

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
      if (s1.length != s2.length) {
        return false;
      }
     else {
        for (int i=0; i < s1.length; i++) {
          if (!(s1[i].equalsIgnoreCase(s2[i]))) {
            return false;
          }
        }
      }
      return true;
    }
}
