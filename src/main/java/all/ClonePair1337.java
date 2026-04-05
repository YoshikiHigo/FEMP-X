package all;

public class ClonePair1337 {

    String method1(byte[] mpi){
      byte[] hex=new byte[2 * mpi.length];
      for (int i=0; i < mpi.length; i++) {
        int num=(int)(mpi[i] >> 4 & 0xf);
        if (num <= 9) {
          hex[2 * i]=(byte)('0' + num);
        }
     else {
          hex[2 * i]=(byte)('A' + num - 10);
        }
        num=(int)(mpi[i] & 0xf);
        if (num <= 9) {
          hex[2 * i + 1]=(byte)('0' + num);
        }
     else {
          hex[2 * i + 1]=(byte)('A' + num - 10);
        }
      }
      return new String(hex);
    }

    String method2(byte[] pHexBinary){
      StringBuffer result=new StringBuffer();
      for (int i=0; i < pHexBinary.length; i++) {
        byte b=pHexBinary[i];
        byte c=(byte)((b & 0xf0) >> 4);
        if (c <= 9) {
          result.append((char)('0' + c));
        }
     else {
          result.append((char)('A' + c - 10));
        }
        c=(byte)(b & 0x0f);
        if (c <= 9) {
          result.append((char)('0' + c));
        }
     else {
          result.append((char)('A' + c - 10));
        }
      }
      return result.toString();
    }
}
