package unverified;

public class ClonePair3638 {

    boolean method1(int[] a1,int[] a2){
      if (a1.length != a2.length)   return false;
      for (int i=0; i < a1.length; i++)   if (Character.toLowerCase((char)a1[i]) != Character.toLowerCase((char)a2[i]))   return false;
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
