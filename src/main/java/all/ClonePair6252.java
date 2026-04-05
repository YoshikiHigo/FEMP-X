package all;

public class ClonePair6252 {

    int method1(byte[] b,int off,boolean bLittleEndian){
      if (bLittleEndian) {
        return ((b[off] & 0xff) | ((b[off + 1] & 0xff) << 8));
      }
      return (((b[off] & 0xff) << 8) | (b[off + 1] & 0xff));
    }

    int method2(byte[] data,int offset,boolean littleEndian){
      int a=data[offset] & 0xFF;
      int b=data[offset + 1] & 0xFF;
      if (littleEndian)   return ((b << 8) | a);
     else   return ((a << 8) | b);
    }
}
