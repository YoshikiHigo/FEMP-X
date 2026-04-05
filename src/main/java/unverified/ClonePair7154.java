package unverified;

public class ClonePair7154 {

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

    int method2(byte[] in,int pos){
      if (in == null || in.length < 4 + pos)   return 0;
      int out=0;
      out+=in[pos + 3] & 0x00ff;
      out+=(in[pos + 2] << 8) & 0xff00;
      out+=(in[pos + 1] << 16) & 0xff0000;
      out+=(in[pos] << 24) & 0xff000000;
      return out;
    }
}
