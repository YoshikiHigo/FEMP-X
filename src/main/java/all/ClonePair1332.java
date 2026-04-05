package all;

public class ClonePair1332 {

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

    String method2(byte[] key){
      StringBuffer buffer=new StringBuffer();
      for (int i=0; i < key.length; i++) {
        int val=key[i];
        if (val < 0) {
          val+=256;
        }
        int hi=val >> 4;
        int lo=val & 15;
        char c_hi=(char)(hi < 10 ? '0' + hi : 'A' + hi - 10);
        char c_lo=(char)(lo < 10 ? '0' + lo : 'A' + lo - 10);
        buffer.append(c_hi);
        buffer.append(c_lo);
      }
      return buffer.toString();
    }
}
