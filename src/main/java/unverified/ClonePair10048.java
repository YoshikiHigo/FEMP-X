package unverified;

public class ClonePair10048 {

    boolean method1(char caractere){
      if ((caractere > 64 && caractere < 91 || caractere > 96 && caractere < 123))   return true;
      return false;
    }

    boolean method2(char aChar){
      if (((aChar < 'A') || (aChar > 'Z')) && ((aChar < 'a') || (aChar > 'z'))) {
        return false;
      }
      return true;
    }
}
