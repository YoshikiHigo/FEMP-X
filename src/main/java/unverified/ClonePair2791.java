package unverified;

public class ClonePair2791 {

    boolean method1(byte[] p_source,byte[] p_destination){
      if ((null == p_source) || (null == p_destination) || (p_source.length != p_destination.length))   return false;
      for (int i=0; i < p_source.length; i++)   if (p_destination[i] != p_source[i])   return false;
      return true;
    }

    boolean method2(byte[] array1,byte[] array2){
      boolean compareresult=false;
      if ((array1 != null) && (array2 != null) && (array1.length == array2.length)) {
        compareresult=true;
        for (int i=0; i < array1.length; i++) {
          if (array1[i] != array2[i]) {
            compareresult=false;
            break;
          }
        }
      }
      return compareresult;
    }
}
