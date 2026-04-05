package all;

public class ClonePair10663 {

    boolean method1(char c){
      if (Character.isDigit(c)) {
        return true;
      }
    switch (c) {
    case 'a':case 'A':case 'b':case 'B':case 'c':case 'C':case 'd':case 'D':case 'e':case 'E':case 'f':case 'F':    return true;
    }
    return false;
    }

    boolean method2(char ch){
      if (ch >= '0' && ch <= '9') {
        return true;
      }
     else   if (ch >= 'a' && ch <= 'f') {
        return true;
      }
     else   if (ch >= 'A' && ch <= 'F') {
        return true;
      }
      return false;
    }
}
