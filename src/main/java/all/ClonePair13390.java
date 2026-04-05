package all;

public class ClonePair13390 {

    byte[] method1(String address){
      byte[] addressBytes=null;
      int dotIndex=address.indexOf('.');
      try {
        if (dotIndex > 0) {
          addressBytes=new byte[4];
          int previousIndex=-1;
          for (int i=0; i < 4; i++) {
            String ipPart=address.substring(previousIndex + 1,dotIndex);
            int ipPartInt=Integer.parseInt(ipPart);
            addressBytes[i]=(byte)ipPartInt;
            previousIndex=dotIndex;
            dotIndex=address.indexOf('.',dotIndex + 1);
            if (dotIndex == -1)         dotIndex=address.length();
          }
        }
      }
     catch (  Exception e) {
        return null;
      }
      return addressBytes;
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
