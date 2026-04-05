package unverified;

public class ClonePair13286 {

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
