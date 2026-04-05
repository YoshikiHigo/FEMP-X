package all;

public class ClonePair7153 {

    int method1(byte[] b,int start){
      if (b == null || b.length < start + (Integer.SIZE / Byte.SIZE))   return 0;
     else {
        int result=0;
        int size=Integer.SIZE / Byte.SIZE;
        for (int i=0; i < size; i++) {
          result+=(0xff << ((size - i - 1) * Byte.SIZE)) & (b[i + start] << ((size - i - 1) * Byte.SIZE));
        }
        return result;
      }
    }

    int method2(byte[] bytes,int offset){
      int result=0;
      if ((bytes != null) && (offset < bytes.length - 3)) {
        result=((int)bytes[offset] & 0xFF) * 0x1000000 + ((int)bytes[offset + 1] & 0xFF) * 0x10000 + ((int)bytes[offset + 2] & 0xFF) * 0x100 + ((int)bytes[offset + 3] & 0xFF);
      }
      return result;
    }
}
