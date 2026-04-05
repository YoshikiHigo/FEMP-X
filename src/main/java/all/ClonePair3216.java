package all;

public class ClonePair3216 {

    boolean method1(byte[] bytes,int firstByte,byte[] values){
      if (values.length + firstByte > bytes.length)   return false;
      boolean result=true;
      int i=0;
      while (result && i < values.length) {
        result=bytes[firstByte + i] == values[i];
        i++;
      }
      return result;
    }

    boolean method2(byte[] buf,int start,byte[] to){
      if ((buf.length - start) < to.length)   return false;
      for (int i=0; i < to.length; i++)   if (buf[start + i] != to[i])   return false;
      return true;
    }
}
