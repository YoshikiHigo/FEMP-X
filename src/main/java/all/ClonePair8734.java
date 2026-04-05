package all;

public class ClonePair8734 {

    char method1(int b){
      char c;
      if (b <= 25) {
        c=(char)('A' + b);
      }
     else   if (b <= 51) {
        c=(char)('a' + b - 26);
      }
     else   if (b <= 61) {
        c=(char)('0' + b - 52);
      }
     else   if (b == 62) {
        c='+';
      }
     else {
        c='/';
      }
      return c;
    }

    char method2(int aValue){
      char retVal='/';
      if (aValue < 26) {
        retVal=(char)('A' + aValue);
      }
     else   if (aValue < 52) {
        retVal=(char)('a' + (aValue - 26));
      }
     else   if (aValue < 62) {
        retVal=(char)('0' + (aValue - 52));
      }
     else   if (aValue == 62) {
        retVal='+';
      }
      return retVal;
    }
}
