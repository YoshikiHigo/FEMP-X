package unverified;

public class ClonePair1565 {

    String method1(byte[] bytes){
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
