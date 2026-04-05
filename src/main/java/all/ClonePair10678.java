package all;

public class ClonePair10678 {

    boolean method1(char c){
      if (((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z')) || ((c >= '0') && (c <= '9')))   return true;
     else   return false;
    }

    boolean method2(char ch){
      if ((ch >= '0') && (ch <= '9')) {
        return true;
      }
      if ((ch >= 'A') && (ch <= 'Z')) {
        return true;
      }
      if ((ch >= 'a') && (ch <= 'z')) {
        return true;
      }
      return false;
    }
}
