package unverified;

public class ClonePair8711 {

    char method1(int input){
      if (input > -1 && input < 26) {
        return (char)('A' + input);
      }
     else   if (input > 25 && input < 52) {
        return (char)('a' + input - 26);
      }
     else   if (input > 51 && input < 62) {
        return (char)('0' + input - 52);
      }
     else   if (input == 62) {
        return '+';
      }
     else   if (input == 63) {
        return '/';
      }
     else {
        return '?';
      }
    }

    char method2(int sixBit){
      if (sixBit >= 0 && sixBit <= 25)   return (char)('A' + sixBit);
      if (sixBit >= 26 && sixBit <= 51)   return (char)('a' + (sixBit - 26));
      if (sixBit >= 52 && sixBit <= 61)   return (char)('0' + (sixBit - 52));
      if (sixBit == 62)   return '+';
      if (sixBit == 63)   return '/';
      return '?';
    }
}
