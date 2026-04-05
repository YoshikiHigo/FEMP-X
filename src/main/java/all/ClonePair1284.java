package all;

public class ClonePair1284 {

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
