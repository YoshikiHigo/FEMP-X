package unverified;

public class ClonePair8707 {

    char method1(int sixBit){
      if ((sixBit >= 0) && (sixBit < 26)) {
        return (char)('A' + sixBit);
      }
      if ((sixBit >= 26) && (sixBit < 52)) {
        return (char)('a' + (sixBit - 26));
      }
      if ((sixBit >= 52) && (sixBit < 62)) {
        return (char)('0' + (sixBit - 52));
      }
      if (sixBit == 62) {
        return '+';
      }
      if (sixBit == 63) {
        return '/';
      }
      return '?';
    }

    char method2(int i){
      if (i >= 0 && i <= 25) {
        return (char)('A' + i);
      }
      if (i >= 26 && i <= 51) {
        return (char)('a' + (i - 26));
      }
      if (i >= 52 && i <= 61) {
        return (char)('0' + (i - 52));
      }
      if (i == 62) {
        return (char)('+');
      }
      if (i == 63) {
        return (char)('/');
      }
      return (char)('?');
    }
}
