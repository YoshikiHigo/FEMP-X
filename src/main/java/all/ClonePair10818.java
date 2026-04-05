package all;

public class ClonePair10818 {

    long method1(byte[] bytes,int off,int len,boolean little){
      if (bytes.length - off < len)   len=bytes.length - off;
      long total=0;
      for (int i=0; i < len; i++) {
        total|=(bytes[i] < 0 ? 256L + bytes[i] : (long)bytes[i]) << ((little ? i : len - i - 1) * 8);
      }
      return total;
    }

    long method2(byte[] bytes,int off,int len,boolean little){
      if (bytes.length - off < len)   len=bytes.length - off;
      long total=0;
      for (int i=0, ndx=off; i < len; i++, ndx++) {
        total|=(bytes[ndx] < 0 ? 256L + bytes[ndx] : (long)bytes[ndx]) << ((little ? i : len - i - 1) * 8);
      }
      return total;
    }
}
