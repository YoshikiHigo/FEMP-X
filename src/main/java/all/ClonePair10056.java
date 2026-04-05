package all;

public class ClonePair10056 {

    boolean method1(char caractere){
      if ((caractere > 64 && caractere < 91 || caractere > 96 && caractere < 123))   return true;
      return false;
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
