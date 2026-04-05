package unverified;

public class ClonePair13375 {

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

    byte[] method2(String hostIp){
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
}
