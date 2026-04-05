package all;

public class ClonePair11203 {

    boolean method1(char c){
      if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || ('0' <= c && c <= '9')) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(char b){
      if ((b >= 'a') && (b <= 'z'))   return true;
      if ((b >= 'A') && (b <= 'Z'))   return true;
      if ((b >= '0') && (b <= '9'))   return true;
      return false;
    }
}
