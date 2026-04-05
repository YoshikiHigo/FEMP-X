package unverified;

public class ClonePair8737 {

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
