package all;

public class ClonePair4111 {

    boolean method1(String[] termos1,String[] termos2){
      if (termos1.length != termos2.length) {
        return false;
      }
      for (int i=0; i < termos1.length; i++) {
        if (!termos1[i].equals(termos2[i])) {
          return false;
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
