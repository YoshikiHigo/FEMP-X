package unverified;

public class ClonePair6098 {

    boolean method1(Object[] array1,Object[] array2){
      boolean result=false;
      if ((array1 == null) && (array2 == null)) {
        result=true;
      }
     else   if ((array1 != null) && (array2 != null) && (array1.length == array2.length)) {
        final Object[] copyArray1=new Object[array1.length];
        final Object[] copyArray2=new Object[array2.length];
        System.arraycopy(array1,0,copyArray1,0,array1.length);
        System.arraycopy(array2,0,copyArray2,0,array2.length);
        result=true;
        for (int i=0; i < copyArray1.length; i++) {
          if (copyArray1[i] == null ? copyArray2[i] != null : !copyArray1[i].equals(copyArray2[i])) {
            result=false;
            break;
          }
        }
      }
      return result;
    }

    boolean method2(Object[] ar1,Object[] ar2){
      if (ar1 == ar2) {
        return true;
      }
      if (ar1 == null) {
        return ar2 == null;
      }
      if (ar2 == null) {
        return false;
      }
      int len1=ar1.length;
      int len2=ar2.length;
      if (len1 != len2) {
        return false;
      }
      for (int i=0; i < len1; i++) {
        if ((ar1[i] != null && !ar1[i].equals(ar2[i])) || (ar1[i] == null && ar2[i] != null)) {
          return false;
        }
      }
      return true;
    }
}
