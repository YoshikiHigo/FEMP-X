package all;

public class ClonePair3314 {

    boolean method1(int[] a,int[] b){
      if (a.length != b.length)   return false;
      for (int i=0, bound=a.length; i < bound; i++)   if (a[i] != b[i])   return false;
      return true;
    }

    boolean method2(int[] array1,int[] array2){
      boolean equal=true;
      if (array1.length != array2.length)   return false;
      for (int i=0; i < array2.length; i++) {
        if (array1[i] != array2[i])     return false;
      }
      return equal;
    }
}
