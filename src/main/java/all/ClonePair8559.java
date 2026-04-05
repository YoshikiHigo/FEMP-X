package all;

public class ClonePair8559 {

    boolean method1(char c){
      if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))   return true;
      return false;
    }

    boolean method2(char caractere){
      if ((caractere > 64 && caractere < 91 || caractere > 96 && caractere < 123))   return true;
      return false;
    }
}
