package all;

public class ClonePair11043 {

    boolean method1(char aChar){
      if (((aChar < 'A') || (aChar > 'Z')) && ((aChar < 'a') || (aChar > 'z'))) {
        return false;
      }
      return true;
    }

    boolean method2(char letra){
      if ((letra >= 'A' && letra <= 'Z') || (letra >= 'a' && letra <= 'z')) {
        return true;
      }
     else {
        return false;
      }
    }
}
