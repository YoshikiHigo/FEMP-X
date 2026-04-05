package unverified;

public class ClonePair11603 {

    boolean method1(char c){
      if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c == 95))   return true;
      return false;
    }

    boolean method2(char c){
      if (c >= 'a' && c <= 'z')   return true;
      if (c >= 'A' && c <= 'Z')   return true;
      if (c == '_')   return true;
      return false;
    }
}
