package all;

public class ClonePair13398 {

    byte[] method1(String hostIp){
      int portSeparatorIdx=hostIp.indexOf(':');
      if (portSeparatorIdx != -1) {
        hostIp=hostIp.substring(0,portSeparatorIdx);
      }
      char[] data=hostIp.toCharArray();
      int IP=0x00;
      int hitDots=0;
      for (int i=0; i < data.length; i++) {
        char c=data[i];
        if (c < 48 || c > 57) {
          return null;
        }
        int b=0x00;
        while (c != '.') {
          if (c < 48 || c > 57) {
            return null;
          }
          b=b * 10 + c - '0';
          if (++i >= data.length) {
            break;
          }
          c=data[i];
        }
        if (b > 0xFF) {
          return null;
        }
        IP=(IP << 8) + b;
        hitDots++;
      }
      if (hitDots != 4 || hostIp.endsWith(".")) {
        return null;
      }
      byte[] addr=new byte[4];
      addr[0]=(byte)((IP >>> 24) & 0xFF);
      addr[1]=(byte)((IP >>> 16) & 0xFF);
      addr[2]=(byte)((IP >>> 8) & 0xFF);
      addr[3]=(byte)(IP & 0xFF);
      return addr;
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
