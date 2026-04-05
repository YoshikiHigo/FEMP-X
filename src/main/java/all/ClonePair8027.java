package all;

public class ClonePair8027 {

    String method1(byte[] buf,int pos,int len){
      StringBuffer hex=new StringBuffer();
      while (len-- > 0) {
        byte ch=buf[pos++];
        int d=(ch >> 4) & 0xf;
        hex.append((char)(d >= 10 ? 'a' - 10 + d : '0' + d));
        d=ch & 0xf;
        hex.append((char)(d >= 10 ? 'a' - 10 + d : '0' + d));
      }
      return hex.toString();
    }

    String method2(byte[] array,int offset,int length){
      String result="";
      for (int i=offset; i < (offset + length); ++i) {
        byte b=array[i];
        String currentHexString=Integer.toHexString(b & 0xFF);
        if (currentHexString.length() == 1)     currentHexString="0" + currentHexString;
        result+=currentHexString;
      }
      return result;
    }
}
