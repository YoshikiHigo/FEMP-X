package all;

public class ClonePair11197 {

    boolean method1(char c){
      if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || ('0' <= c && c <= '9')) {
        return true;
      }
     else {
        return false;
      }
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
