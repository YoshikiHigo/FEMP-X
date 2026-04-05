package unverified;

public class ClonePair10664 {

    boolean method1(char c){
      if (Character.isDigit(c)) {
        return true;
      }
    switch (c) {
    case 'a':case 'A':case 'b':case 'B':case 'c':case 'C':case 'd':case 'D':case 'e':case 'E':case 'f':case 'F':    return true;
    }
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
