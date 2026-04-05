package all;

public class ClonePair13278 {

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
