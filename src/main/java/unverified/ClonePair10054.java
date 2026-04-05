package unverified;

public class ClonePair10054 {

    boolean method1(char caractere){
      if ((caractere > 64 && caractere < 91 || caractere > 96 && caractere < 123))   return true;
      return false;
    }

    boolean method2(char ch){
      if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
        return true;
      }
      return false;
    }
}
