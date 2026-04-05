package all;

public class ClonePair1168 {

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
