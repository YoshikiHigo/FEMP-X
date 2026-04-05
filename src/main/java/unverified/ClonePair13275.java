package unverified;

public class ClonePair13275 {

    byte[] method1(String s){
      int numDigits;
      int currentOctet;
      byte[] values=new byte[4];
      int currentValue;
      int length=s.length();
      currentOctet=0;
      currentValue=0;
      numDigits=0;
      for (int i=0; i < length; i++) {
        char c=s.charAt(i);
        if (c >= '0' && c <= '9') {
          if (numDigits == 3)       return null;
          if (numDigits > 0 && currentValue == 0)       return null;
          numDigits++;
          currentValue*=10;
          currentValue+=(c - '0');
          if (currentValue > 255)       return null;
        }
     else     if (c == '.') {
          if (currentOctet == 3)       return null;
          if (numDigits == 0)       return null;
          values[currentOctet++]=(byte)currentValue;
          currentValue=0;
          numDigits=0;
        }
     else     return null;
      }
      if (currentOctet != 3)   return null;
      if (numDigits == 0)   return null;
      values[currentOctet]=(byte)currentValue;
      return values;
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
