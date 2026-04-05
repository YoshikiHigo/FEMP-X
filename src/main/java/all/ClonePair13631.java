package all;

public class ClonePair13631 {

    byte[] method1(String addr){
      final byte[] ip=new byte[4];
      int dotCount=0;
      for (int pos=0; pos < addr.length(); ) {
        if ((pos != 0) && (addr.charAt(pos) == '.')) {
          dotCount++;
          if (dotCount > 3)       return null;
          pos++;
        }
        int start=pos;
        while ((pos < addr.length()) && Character.isDigit(addr.charAt(pos)))     pos++;
        if (pos != start) {
          try {
            final int i=Integer.parseInt(addr.substring(start,pos));
            if ((i < 0) || (255 < i))         return null;
            ip[dotCount]=(byte)i;
          }
     catch (      NumberFormatException e) {
            return null;
          }
        }
     else     return null;
      }
      if (dotCount != 3)   return null;
      return ip;
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
