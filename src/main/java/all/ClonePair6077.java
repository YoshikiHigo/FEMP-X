package all;

public class ClonePair6077 {

    boolean method1(Object[] s1,Object[] s2){
      if (s1 == null && s2 == null)   return true;
      if (s1 == null || s2 == null)   return false;
      if (s1.length != s2.length)   return false;
      for (int i=0; i < s1.length; i++) {
        if (s1[i] != s2[i])     return false;
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
