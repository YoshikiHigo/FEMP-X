package unverified;

public class ClonePair1133 {

    String method1(byte[] resp){
      StringBuffer buf=new StringBuffer(resp.length * 2);
      for (int i=0; i < resp.length; i++) {
        int h=(resp[i] & 0xf0) >> 4;
        int j=(resp[i] & 0x0f);
        buf.append(new Character((char)((h > 9) ? 'a' + h - 10 : '0' + h)));
        buf.append(new Character((char)((j > 9) ? 'a' + j - 10 : '0' + j)));
      }
      return buf.toString();
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
