package all;

public class ClonePair10661 {

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
      if (('0' <= c) && (c <= '9'))   return true;
     else {
        c=Character.toLowerCase(c);
        if (('a' <= c) && (c <= 'f'))     return true;
      }
      return false;
    }
}
