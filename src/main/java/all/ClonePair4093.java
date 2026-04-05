package all;

public class ClonePair4093 {

    boolean method1(String[] s1,String[] s2){
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
