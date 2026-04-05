package all;

public class ClonePair10671 {

    boolean method1(char c){
      if (((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z')) || ((c >= '0') && (c <= '9')))   return true;
     else   return false;
    }

    boolean method2(char c){
      if (((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z')) || ((c >= '0') && (c <= '9'))) {
        return true;
      }
     else   return false;
    }
}
