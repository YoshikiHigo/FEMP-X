package unverified;

public class ClonePair8736 {

    char method1(int sixbit){
      if (sixbit >= 0 && sixbit <= 25) {
        return (char)(65 + sixbit);
      }
      if (sixbit >= 26 && sixbit <= 51) {
        return (char)(97 + (sixbit - 26));
      }
      if (sixbit >= 52 && sixbit <= 61) {
        return (char)(48 + (sixbit - 52));
      }
      if (sixbit == 62) {
        return '+';
      }
      return sixbit != 63 ? '?' : '/';
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
