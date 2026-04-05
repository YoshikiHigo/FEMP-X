package all;

public class ClonePair3029 {

    boolean method1(byte[] array1,byte[] array2){
      boolean same=true;
      int len1=array1.length;
      if (len1 == array2.length) {
        int i=0;
        while (i < len1 && same) {
          same=(array1[i] == array2[i]);
          i++;
        }
      }
     else {
        same=false;
      }
      return same;
    }

    boolean method2(byte[] a,byte[] b){
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; ++i)   if (a[i] != b[i])   return false;
      return true;
    }
}
