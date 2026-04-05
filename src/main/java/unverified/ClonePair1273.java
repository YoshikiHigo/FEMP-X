package unverified;

public class ClonePair1273 {

    String method1(byte[] md5){
      int len=md5.length;
      StringBuffer res=new StringBuffer(len);
      for (int i=0; i < len; ++i) {
        if (md5[i] < 0) {
          res.append(Integer.toHexString(md5[i] + 256));
        }
     else {
          String rs=Integer.toHexString(md5[i]);
          if (rs.length() == 1) {
            res.append('0');
          }
          res.append(rs);
        }
      }
      return res.toString();
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
