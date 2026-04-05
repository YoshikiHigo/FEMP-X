package all;

public class ClonePair1163 {

    String method1(byte[] buf){
      StringBuffer sbuff=new StringBuffer();
      for (int i=0; i < buf.length; i++) {
        int b=buf[i];
        if (b < 0)     b=b & 0xFF;
        if (b < 16)     sbuff.append("0");
        sbuff.append(Integer.toHexString(b).toUpperCase());
      }
      return sbuff.toString();
    }

    String method2(byte[] mpi){
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
}
