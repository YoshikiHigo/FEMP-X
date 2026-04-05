package all;

public class ClonePair13394 {

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
}
