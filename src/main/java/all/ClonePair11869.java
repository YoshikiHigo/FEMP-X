package all;

public class ClonePair11869 {

    boolean method1(char letra){
      if ((letra >= 'A' && letra <= 'Z') || (letra >= 'a' && letra <= 'z')) {
        return true;
      }
     else {
        return false;
      }
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
