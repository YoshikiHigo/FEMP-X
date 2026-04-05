package unverified;

public class ClonePair13622 {

    int method1(char c){
      if (c >= '0' && c <= '9')   return c - '0';
      if (c >= 'a' && c <= 'f')   return c - 'a' + 10;
      if (c >= 'A' && c <= 'F')   return c - 'A' + 10;
      return 0;
    }

    int method2(char code){
      if (code == 'A' || code == 'a') {
        return 10;
      }
     else   if (code == 'B' || code == 'b') {
        return 11;
      }
     else   if (code == 'C' || code == 'c') {
        return 12;
      }
     else   if (code == 'D' || code == 'd') {
        return 13;
      }
     else   if (code == 'E' || code == 'e') {
        return 14;
      }
     else   if (code == 'F' || code == 'f') {
        return 15;
      }
     else {
        try {
          return Integer.parseInt(String.valueOf(code));
        }
     catch (    NumberFormatException e) {
          return 0;
        }
      }
    }
}
