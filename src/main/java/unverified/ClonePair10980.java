package unverified;

public class ClonePair10980 {

    byte method1(char c){
      byte b=(byte)c;
      if (b >= 0x41 && b <= 0x5A) {
        return (byte)(b - 0x41);
      }
      if (b >= 0x61 && b <= 0x7A) {
        return (byte)(b - 0x61 + 26);
      }
      if (b >= 0x30 && b <= 0x39) {
        return (byte)(b - 0x30 + 52);
      }
      if (b == 0x2B) {
        return 62;
      }
      if (b == 0x2F) {
        return 63;
      }
      return -1;
    }

    byte method2(char c){
      if (c >= 'A' && c <= 'Z')   return (byte)(c - 'A');
      if (c >= 'a' && c <= 'z')   return (byte)(c - 'a' + 26);
      if (c >= '0' && c <= '9')   return (byte)(c - '0' + 52);
      if (c == '+')   return (byte)62;
      if (c == '/')   return (byte)63;
      return (byte)-1;
    }
}
