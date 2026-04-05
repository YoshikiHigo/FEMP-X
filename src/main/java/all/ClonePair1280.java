package all;

public class ClonePair1280 {

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
      StringBuilder sb=new StringBuilder();
      for (  byte b : data) {
        if (b < 0)     sb.append(Integer.toHexString(256 + b));
     else     if (b < 16)     sb.append("0").append(Integer.toHexString(b));
     else     sb.append(Integer.toHexString(b));
      }
      return sb.toString();
    }
}
