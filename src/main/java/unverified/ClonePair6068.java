package unverified;

public class ClonePair6068 {

    boolean method1(Object[] arr1,Object[] arr2){
      if (arr1 == null && arr2 == null)   return true;
      if (arr1 == null ^ arr2 == null)   return false;
      if (!arr1.getClass().equals(arr2.getClass()))   return false;
      if (arr1.length != arr2.length)   return false;
      for (int i=0; i < arr1.length; ++i) {
        Object obj1=arr1[i];
        Object obj2=arr2[i];
        if (obj1 == null ^ obj2 == null)     return false;
        if (obj1 != null && !obj1.equals(obj2))     return false;
      }
      return true;
    }

    boolean method2(Object[] array1,Object[] array2){
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
}
