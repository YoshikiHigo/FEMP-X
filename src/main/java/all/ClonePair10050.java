package all;

public class ClonePair10050 {

    boolean method1(char caractere){
      if ((caractere > 64 && caractere < 91 || caractere > 96 && caractere < 123))   return true;
      return false;
    }

    boolean method2(char flag){
      if (flag >= 'a' && flag <= 'z') {
        return true;
      }
      if (flag >= 'A' && flag <= 'Z') {
        return true;
      }
      return false;
    }
}
