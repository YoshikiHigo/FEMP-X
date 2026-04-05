package all;

public class ClonePair13282 {

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
