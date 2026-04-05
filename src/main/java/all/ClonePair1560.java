package all;

public class ClonePair1560 {

    String method1(byte[] bytes){
      String content="";
      for (int i=0; i < bytes.length; i++) {
        int bt=bytes[i];
        if (bt < 0)     bt=bt + 256;
        String tmp=Integer.toHexString(bt);
        if (tmp.length() == 1)     content=content + "0";
        content=content + tmp;
      }
      return content.toUpperCase();
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
