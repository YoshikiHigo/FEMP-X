package unverified;

public class ClonePair4083 {

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

    boolean method2(String[] arr1,String[] arr2){
      if (arr1.length != arr2.length) {
        return false;
      }
     else {
        for (int ii=0; ii < arr1.length; ii++) {
          if (!arr1[ii].equals(arr2[ii])) {
            System.err.println("Not equal: " + arr1[ii] + " and "+ arr2[ii]);
            return false;
          }
        }
        return true;
      }
    }
}
