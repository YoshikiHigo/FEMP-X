package unverified;

public class ClonePair1566 {

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

    String method2(byte[] pHexBinary){
      StringBuffer result=new StringBuffer();
      for (int i=0; i < pHexBinary.length; i++) {
        byte b=pHexBinary[i];
        byte c=(byte)((b & 0xf0) >> 4);
        if (c <= 9) {
          result.append((char)('0' + c));
        }
     else {
          result.append((char)('A' + c - 10));
        }
        c=(byte)(b & 0x0f);
        if (c <= 9) {
          result.append((char)('0' + c));
        }
     else {
          result.append((char)('A' + c - 10));
        }
      }
      return result.toString();
    }
}
