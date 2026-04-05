package unverified;

public class ClonePair3206 {

    boolean method1(byte[] a,int offset,byte[] a2){
      if ((a.length - offset) >= a2.length) {
        for (int i=0; i < a2.length; i++) {
          if (a[i + offset] != a2[i])       return false;
        }
        return true;
      }
     else   return false;
    }

    boolean method2(byte[] srcArray,int srcStart,byte[] array){
      boolean matched=true;
      for (int i=srcStart; i < srcStart + array.length; i++) {
        if (i >= srcArray.length)     return false;
        if (array[i - srcStart] != srcArray[i]) {
          matched=false;
        }
      }
      return matched;
    }
}
