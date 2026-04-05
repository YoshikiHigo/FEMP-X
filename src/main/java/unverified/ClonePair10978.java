package unverified;

public class ClonePair10978 {

    byte method1(char encoded){
      if (encoded >= 'A' && encoded <= 'Z') {
        return (byte)(encoded - 'A');
      }
      if (encoded >= 'a' && encoded <= 'z') {
        return (byte)(encoded - 'a' + 26);
      }
      if (encoded >= '0' && encoded <= '9') {
        return (byte)(encoded - '0' + 52);
      }
      if (encoded == '+')   return (byte)62;
      if (encoded == '/')   return (byte)63;
      return (byte)-1;
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
