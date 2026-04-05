package all;

public class ClonePair4072 {

    boolean method1(String[] one,String[] two){
      if ((one == null) && (two == null))   return true;
      if ((one == null) || (two == null))   return false;
      if (one.length != two.length)   return false;
      for (int i=0; i < one.length; i++) {
        if (!one[i].equals(two[i]))     return false;
      }
      return true;
    }

    boolean method2(String[] firstArray,String[] secondArray){
      boolean equal=true;
      if (firstArray != null) {
        if ((secondArray == null) || (firstArray.length != secondArray.length)) {
          equal=false;
        }
     else {
          for (int i=0; equal && i < firstArray.length; i++) {
            if (!firstArray[i].equals(secondArray[i])) {
              equal=false;
            }
          }
        }
      }
     else {
        equal=(secondArray == null);
      }
      return equal;
    }
}
