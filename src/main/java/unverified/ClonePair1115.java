package unverified;

public class ClonePair1115 {

    String method1(byte[] resp){
      StringBuffer buf=new StringBuffer(resp.length * 2);
      for (int i=0; i < resp.length; i++) {
        int h=(resp[i] & 0xf0) >> 4;
        int j=(resp[i] & 0x0f);
        buf.append(new Character((char)((h > 9) ? 'a' + h - 10 : '0' + h)));
        buf.append(new Character((char)((j > 9) ? 'a' + j - 10 : '0' + j)));
      }
      return buf.toString();
    }

    String method2(byte[] data){
      StringBuilder buf=new StringBuilder();
      for (int i=0; i < data.length; i++) {
        int low4Bits=data[i] & 0x0F;
        int high4Bits=(data[i] & 0xF0) >>> 4;
        buf.append(0 <= high4Bits && high4Bits <= 9 ? (char)('0' + high4Bits) : (char)('a' + (high4Bits - 10)));
        buf.append(0 <= low4Bits && low4Bits <= 9 ? (char)('0' + low4Bits) : (char)('a' + (low4Bits - 10)));
      }
      return buf.toString();
    }
}
