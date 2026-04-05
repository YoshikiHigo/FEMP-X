package all;

public class ClonePair10154 {

    boolean method1(char c){
      boolean rval=false;
      if (c == ' ' || c == '\n' || c == '\t' || c == '\r') {
        rval=true;
      }
      return rval;
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
