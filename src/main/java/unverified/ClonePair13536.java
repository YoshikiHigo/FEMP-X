package unverified;

public class ClonePair13536 {

    byte[] method1(String addr){
      String parts[]=addr.split("\\.",-1);
      if (parts.length != 4) {
        return null;
      }
      byte b[]=new byte[4];
      for (int i=0; i < 4; i++) {
        try {
          int v=Integer.parseInt(parts[i]);
          if (v >= 0 && v <= 255) {
            b[i]=(byte)v;
          }
     else {
            return null;
          }
        }
     catch (    NumberFormatException e) {
          return null;
        }
      }
      return b;
    }

    byte[] method2(String src){
      final int INADDRSZ=4;
      if (src.length() == 0) {
        return null;
      }
      int octets;
      char ch;
      byte[] dst=new byte[INADDRSZ];
      char[] srcb=src.toCharArray();
      boolean saw_digit=false;
      octets=0;
      int i=0;
      int cur=0;
      while (i < srcb.length) {
        ch=srcb[i++];
        if (Character.isDigit(ch)) {
          int sum=dst[cur] * 10 + (Character.digit(ch,10) & 0xff);
          if (sum > 255)       return null;
          dst[cur]=(byte)(sum & 0xff);
          if (!saw_digit) {
            if (++octets > INADDRSZ)         return null;
            saw_digit=true;
          }
        }
     else     if (ch == '.' && saw_digit) {
          if (octets == INADDRSZ)       return null;
          cur++;
          dst[cur]=0;
          saw_digit=false;
        }
     else     return null;
      }
      if (octets < INADDRSZ)   return null;
      return dst;
    }
}
