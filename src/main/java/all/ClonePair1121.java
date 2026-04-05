package all;

public class ClonePair1121 {

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

    @SuppressWarnings("unused") String method2(byte[] digest){
      StringBuffer buffer=new StringBuffer();
      for (int i=0; i < digest.length; ++i) {
        final byte b=digest[i];
        final int value=(b & 0x7F) + (b < 0 ? 128 : 0);
        buffer.append(value < 16 ? "0" : "");
        buffer.append(Integer.toHexString(value));
      }
      return buffer.toString();
    }
}
