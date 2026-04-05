package unverified;

public class ClonePair1327 {

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

    String method2(byte[] bytes){
      String content="";
      for (int i=0; i < bytes.length; i++) {
        int bt=bytes[i];
        if (bt < 0)     bt=bt + 256;
        String tmp=Integer.toHexString(bt);
        if (tmp.length() == 1)     content=content + "0";
        content=content + tmp;
      }
      return content.toUpperCase();
    }
}
