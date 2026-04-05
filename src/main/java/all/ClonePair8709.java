package all;

public class ClonePair8709 {

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

    char method2(int sixbit){
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
}
