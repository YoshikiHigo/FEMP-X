package all;

public class ClonePair8127 {

    byte method1(byte b){
      if ((b >= '0') && (b <= '9'))   return (byte)(b - '0');
      if ((b >= 'a') && (b <= 'f'))   return (byte)(b - 'a' + 10);
      if ((b >= 'A') && (b <= 'F'))   return (byte)(b - 'A' + 10);
      return 0;
    }

    byte method2(byte b){
      if ((b >= '0') && (b <= '9')) {
        return (byte)(b - '0');
      }
      if ((b >= 'a') && (b <= 'f')) {
        return (byte)(b - 'a' + 10);
      }
      if ((b >= 'A') && (b <= 'F')) {
        return (byte)(b - 'A' + 10);
      }
      return 0;
    }
}
