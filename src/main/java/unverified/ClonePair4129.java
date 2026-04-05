package unverified;

public class ClonePair4129 {

    boolean method1(String[] arr1,String[] arr2){
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

    boolean method2(String[] a1,String[] a2){
      if (a1.length != a2.length)   return (false);
      for (int i=0; i < a1.length; i++) {
        if (!a1[i].equals(a2[i]))     return (false);
      }
      return (true);
    }
}
