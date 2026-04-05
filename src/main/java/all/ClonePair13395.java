package all;

public class ClonePair13395 {

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

    byte[] method2(String addr){
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
}
