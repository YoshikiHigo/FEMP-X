package all;

public class ClonePair3205 {

    boolean method1(byte[] a,int offset,byte[] a2){
      if ((a.length - offset) >= a2.length) {
        for (int i=0; i < a2.length; i++) {
          if (a[i + offset] != a2[i])       return false;
        }
        return true;
      }
     else   return false;
    }

    boolean method2(byte[] bytes,int firstByte,byte[] values){
      if (values.length + firstByte > bytes.length)   return false;
      boolean result=true;
      int i=0;
      while (result && i < values.length) {
        result=bytes[firstByte + i] == values[i];
        i++;
      }
      return result;
    }
}
