package all;

public class ClonePair1167 {

    String method1(byte[] buf){
      StringBuffer sbuff=new StringBuffer();
      for (int i=0; i < buf.length; i++) {
        int b=buf[i];
        if (b < 0)     b=b & 0xFF;
        if (b < 16)     sbuff.append("0");
        sbuff.append(Integer.toHexString(b).toUpperCase());
      }
      return sbuff.toString();
    }

    String method2(byte[] key){
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
}
