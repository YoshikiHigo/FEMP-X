package unverified;

public class ClonePair11838 {

    boolean method1(char c){
      char upper=Character.toUpperCase(c);
      if ((upper < '0' || upper > '9') && (upper < 'A' || upper > 'F')) {
        return false;
      }
      return true;
    }

    boolean method2(char c){
      boolean result;
    switch (c) {
    case 'a':case 'b':case 'c':case 'd':case 'e':case 'f':case 'A':case 'B':case 'C':case 'D':case 'E':case 'F':case '0':case '1':case '2':case '3':case '4':case '5':case '6':case '7':case '8':case '9':    result=true;
      break;
    default:result=false;
    }
    return result;
    }
}
