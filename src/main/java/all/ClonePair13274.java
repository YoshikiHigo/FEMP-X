package all;

public class ClonePair13274 {

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

    byte[] method2(String address){
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
}
