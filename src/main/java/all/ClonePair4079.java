package all;

public class ClonePair4079 {

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

    boolean method2(String[] array1,String[] array2){
      if (array1.length != array2.length) {
        System.err.println("Not equal lengths: " + array1.length + "/"+ array2.length);
        return false;
      }
      for (int i=0; i < array1.length; i++) {
        if (!(array1[i].equals(array2[i]))) {
          System.err.println("Not equal: " + array1 + "/"+ array2);
          return false;
        }
      }
      return true;
    }
}
