package all;

public class ClonePair1794 {

    String method1(byte[] key){
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
