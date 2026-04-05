package all;

public class ClonePair4119 {

    @SuppressWarnings("null") boolean method1(String[] s1,String[] s2){
      if (s1 == null && s2 == null)   return true;
      if (s1 == null && s2 != null)   return false;
      if (s1 != null && s2 == null)   return false;
      if (s1.length != s2.length)   return false;
      for (int i=0; i < s1.length; i++) {
        if (!s1[i].equals(s2[i]))     return false;
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
