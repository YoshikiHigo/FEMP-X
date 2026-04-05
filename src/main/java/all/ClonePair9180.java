package all;

public class ClonePair9180 {

    boolean method1(char c){
      if ('a' <= c && c <= 'z')   return true;
      if ('A' <= c && c <= 'Z')   return true;
      if ('0' <= c && c <= '9')   return true;
      return false;
    }

    boolean method2(char c){
      if ((c >= 65 && c < 91) || (c >= 97 && c < 123)) {
        return true;
      }
     else   if (c >= 48 && c <= 57) {
        return true;
      }
     else {
        return false;
      }
    }
}
