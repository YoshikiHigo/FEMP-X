package unverified;

public class ClonePair4123 {

    boolean method1(String[] r,String[] s){
      int l=r.length;
      if (l == s.length) {
        if (l != 0) {
          for (int i=0; i < l; i++) {
            if (!r[i].equals(s[i])) {
              return false;
            }
          }
        }
        return true;
      }
      return false;
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
