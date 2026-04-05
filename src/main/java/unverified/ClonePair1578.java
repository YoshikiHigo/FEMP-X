package unverified;

public class ClonePair1578 {

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

    String method2(byte[] ba){
      String s="";
      int i;
      for (int j1=0; j1 < ba.length; j1++) {
        i=(int)ba[j1];
        if (i < 0)     i+=256;
        if (i < 160) {
          s=s + (i / 16);
        }
     else {
          s=s + (char)('a' + ((i - 160) / 16));
        }
        i=i % 16;
        if (i < 10) {
          s=s + i;
        }
     else {
          s=s + (char)('a' + (i - 10));
        }
      }
      return s;
    }
}
