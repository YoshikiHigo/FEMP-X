package all;

public class ClonePair9595 {

    boolean method1(char[] a1,char[] a2){
      if (a1 == a2)   return true;
      if (null == a1 || null == a2)   return false;
      if (a1.length == a2.length) {
        int i=a1.length;
        while (--i >= 0)     if (a1[i] != a2[i])     return false;
        return true;
      }
      return false;
    }

    boolean method2(char[] arr1,char[] arr2){
      if (arr1 == arr2)   return true;
      if (arr1 != null && arr2 != null && arr1.length == arr2.length) {
        for (int i=arr1.length; i-- > 0; )     if (arr1[i] != arr2[i])     return false;
        return true;
      }
      return false;
    }
}
