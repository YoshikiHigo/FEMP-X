package all;

public class ClonePair4084 {

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

    boolean method2(String[] a1,String[] a2){
      if (a1.length != a2.length)   return (false);
      for (int i=0; i < a1.length; i++) {
        if (!a1[i].equals(a2[i]))     return (false);
      }
      return (true);
    }
}
