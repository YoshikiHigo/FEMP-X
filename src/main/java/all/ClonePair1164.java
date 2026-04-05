package all;

public class ClonePair1164 {

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

    String method2(byte[] bytes){
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
}
