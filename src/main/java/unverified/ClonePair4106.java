package unverified;

public class ClonePair4106 {

    boolean method1(String[] array1,String[] array2){
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
