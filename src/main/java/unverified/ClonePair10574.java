package unverified;

public class ClonePair10574 {

    boolean method1(char c){
      if (((c >= '0') && (c <= '9')) || ((c >= 'a') && (c <= 'f')) || ((c >= 'A') && (c <= 'F')))   return true;
      return false;
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
