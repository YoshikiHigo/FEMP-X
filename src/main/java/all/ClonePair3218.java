package all;

public class ClonePair3218 {

    boolean method1(byte[] buf,int start,byte[] to){
      if ((buf.length - start) < to.length)   return false;
      for (int i=0; i < to.length; i++)   if (buf[start + i] != to[i])   return false;
      return true;
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
