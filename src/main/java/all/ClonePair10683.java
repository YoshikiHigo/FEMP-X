package all;

public class ClonePair10683 {

    boolean method1(char c){
      if (((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z')) || ((c >= '0') && (c <= '9')))   return true;
     else   return false;
    }

    boolean method2(char aChar){
      if (((aChar < 'A') || (aChar > 'Z')) && ((aChar < 'a') || (aChar > 'z')) && ((aChar < '0') || (aChar > '9'))) {
        return false;
      }
      return true;
    }
}
