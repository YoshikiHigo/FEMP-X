package all;

public class ClonePair1576 {

    @SuppressWarnings("unused") String method1(byte[] digest){
      StringBuffer buffer=new StringBuffer();
      for (int i=0; i < digest.length; ++i) {
        final byte b=digest[i];
        final int value=(b & 0x7F) + (b < 0 ? 128 : 0);
        buffer.append(value < 16 ? "0" : "");
        buffer.append(Integer.toHexString(value));
      }
      return buffer.toString();
    }

    String method2(byte[] data){
      StringBuilder sb=new StringBuilder();
      for (  byte b : data) {
        if (b < 0)     sb.append(Integer.toHexString(256 + b));
     else     if (b < 16)     sb.append("0").append(Integer.toHexString(b));
     else     sb.append(Integer.toHexString(b));
      }
      return sb.toString();
    }
}
