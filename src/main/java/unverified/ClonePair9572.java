package unverified;

public class ClonePair9572 {

    boolean method1(char c){
      if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')   return true;
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
