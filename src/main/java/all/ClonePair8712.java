package all;

public class ClonePair8712 {

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
