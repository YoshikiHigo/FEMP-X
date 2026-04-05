package unverified;

public class ClonePair9689 {

    boolean method1(char ch){
      if ((ch == ' ') || (ch == '\t') || (ch == '\r')|| (ch == '\n'))   return (true);
     else   return (false);
    }

    boolean method2(char ch){
      if (ch == 32) {
        return true;
      }
     else   if (ch == 10) {
        return true;
      }
     else   if (ch == 13) {
        return true;
      }
     else   if (ch == 9) {
        return true;
      }
      return false;
    }
}
