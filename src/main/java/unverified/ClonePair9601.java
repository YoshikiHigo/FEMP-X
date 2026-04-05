package unverified;

public class ClonePair9601 {

    boolean method1(char c){
      if ((c >= 65 && c < 91) || (c >= 97 && c < 123)) {
        return true;
      }
     else   if (c >= 48 && c <= 57) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(char c){
      if (('0' <= c) && (c <= '9'))   return true;
     else {
        c=Character.toLowerCase(c);
        if (('a' <= c) && (c <= 'f'))     return true;
      }
      return false;
    }
}
