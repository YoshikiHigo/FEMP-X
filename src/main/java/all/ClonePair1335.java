package all;

public class ClonePair1335 {

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

    String method2(byte[] _buffer){
      StringBuffer buffer=new StringBuffer();
      for (int i=0; i < _buffer.length; i++) {
        if (_buffer[i] <= 0x0F && _buffer[i] > 0x00)     buffer.append('0');
     else     if (_buffer[i] == 0x00) {
          buffer.append("00");
          continue;
        }
        buffer.append(Integer.toHexString(_buffer[i] & 0xFF).toUpperCase());
      }
      return buffer.toString();
    }
}
