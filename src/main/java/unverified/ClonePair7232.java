package unverified;

public class ClonePair7232 {

    int method1(byte[] bytes,int offset){
      int result=0;
      if ((bytes != null) && (offset < bytes.length - 3)) {
        result=((int)bytes[offset] & 0xFF) * 0x1000000 + ((int)bytes[offset + 1] & 0xFF) * 0x10000 + ((int)bytes[offset + 2] & 0xFF) * 0x100 + ((int)bytes[offset + 3] & 0xFF);
      }
      return result;
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
