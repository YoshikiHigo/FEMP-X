package unverified;

public class ClonePair8746 {

    char method1(int sixBit){
      if (sixBit < 26)   return (char)('A' + sixBit);
      if (sixBit < 52)   return (char)(('a' - 26) + sixBit);
      if (sixBit < 62)   return (char)(('0' - 52) + sixBit);
      if (sixBit == 62)   return '+';
      return '/';
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
