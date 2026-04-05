package all;

public class ClonePair9729 {

    boolean method1(char[] arr1,char[] arr2){
      if (arr1 == arr2)   return true;
      if (arr1 != null && arr2 != null && arr1.length == arr2.length) {
        for (int i=arr1.length; i-- > 0; )     if (arr1[i] != arr2[i])     return false;
        return true;
      }
      return false;
    }

    boolean method2(char[] c1,char[] c2){
      if (c1 == null)   return c2 == null;
      if (c2 == null)   return false;
      if (c1.length != c2.length)   return false;
      for (int i=0; i < c1.length; i++) {
        if (c1[i] != c2[i])     return false;
      }
      return true;
    }
}
