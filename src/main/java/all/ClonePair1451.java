package all;

public class ClonePair1451 {

    String method1(byte[] data){
      StringBuilder buf=new StringBuilder();
      for (int i=0; i < data.length; i++) {
        int low4Bits=data[i] & 0x0F;
        int high4Bits=(data[i] & 0xF0) >>> 4;
        buf.append(0 <= high4Bits && high4Bits <= 9 ? (char)('0' + high4Bits) : (char)('a' + (high4Bits - 10)));
        buf.append(0 <= low4Bits && low4Bits <= 9 ? (char)('0' + low4Bits) : (char)('a' + (low4Bits - 10)));
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
