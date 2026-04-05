package unverified;

public class ClonePair10797 {

    boolean method1(char ch){
      if (ch <= 'z' && 'a' <= ch) {
        return true;
      }
     else   if (ch <= 'Z' && 'A' <= ch) {
        return true;
      }
      return ch <= '9' && '0' <= ch;
    }

    boolean method2(char b){
      if ((b >= 'a') && (b <= 'z'))   return true;
      if ((b >= 'A') && (b <= 'Z'))   return true;
      if ((b >= '0') && (b <= '9'))   return true;
      return false;
    }
}
