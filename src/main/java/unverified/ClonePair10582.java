package unverified;

public class ClonePair10582 {

    boolean method1(char c){
      if (((c >= '0') && (c <= '9')) || ((c >= 'a') && (c <= 'f')) || ((c >= 'A') && (c <= 'F')))   return true;
      return false;
    }

    boolean method2(char c){
      char upper=Character.toUpperCase(c);
      if ((upper < '0' || upper > '9') && (upper < 'A' || upper > 'F')) {
        return false;
      }
      return true;
    }
}
