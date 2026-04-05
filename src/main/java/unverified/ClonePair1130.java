package unverified;

public class ClonePair1130 {

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

    String method2(byte[] bytes){
      StringBuilder sb=new StringBuilder();
      for (int i=0; i < bytes.length; i++) {
        byte b=bytes[i];
        if (b < 0)     sb.append(Integer.toHexString(256 + b));
     else     if (b < 16)     sb.append("0").append(Integer.toHexString(b));
     else     sb.append(Integer.toHexString(b));
      }
      return sb.toString();
    }
}
