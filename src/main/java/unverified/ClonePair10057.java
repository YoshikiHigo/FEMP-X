package unverified;

public class ClonePair10057 {

    boolean method1(char caractere){
      if ((caractere > 64 && caractere < 91 || caractere > 96 && caractere < 123))   return true;
      return false;
    }

    boolean method2(char ch){
      if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
        return true;
      }
     else {
        return false;
      }
    }
}
