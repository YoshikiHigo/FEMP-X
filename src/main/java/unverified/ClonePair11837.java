package unverified;

public class ClonePair11837 {

    boolean method1(char c){
      char upper=Character.toUpperCase(c);
      if ((upper < '0' || upper > '9') && (upper < 'A' || upper > 'F')) {
        return false;
      }
      return true;
    }

    boolean method2(char ch){
      if (ch >= '0' && ch <= '9')   return true;
      if (ch >= 'A' && ch <= 'F')   return true;
      if (ch >= 'a' && ch <= 'f')   return true;
      return false;
    }
}
