package unverified;

public class ClonePair1791 {

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
