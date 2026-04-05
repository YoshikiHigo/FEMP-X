package all;

public class ClonePair1885 {

    String method1(byte[] bytes){
      StringBuilder sb=new StringBuilder();
      for (int i=0; i < bytes.length; i++) {
        byte b=bytes[i];
        if (b < 0)     sb.append(Integer.toHexString(256 + b));
     else     if (b < 16)     sb.append("0").append(Integer.toHexString(b));
     else     sb.append(Integer.toHexString(b));
      }
      return sb.toString();
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
