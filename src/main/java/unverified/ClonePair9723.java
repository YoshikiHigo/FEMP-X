package unverified;

public class ClonePair9723 {

    boolean method1(char[] arr1,char[] arr2){
      if (arr1 == arr2)   return true;
      if (arr1 != null && arr2 != null && arr1.length == arr2.length) {
        for (int i=arr1.length; i-- > 0; )     if (arr1[i] != arr2[i])     return false;
        return true;
      }
      return false;
    }

    boolean method2(char[] a,char[] a2){
      if (a == a2)   return true;
      if (a == null || a2 == null)   return false;
      int length=a.length;
      if (a2.length != length)   return false;
      for (int i=0; i < length; i++)   if (a[i] != a2[i])   return false;
      return true;
    }
}
