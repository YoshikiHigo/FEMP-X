package all;

public class ClonePair1270 {

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
