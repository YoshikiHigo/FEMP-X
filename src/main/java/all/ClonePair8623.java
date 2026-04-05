package all;

public class ClonePair8623 {

    boolean method1(char currentChar){
      if ((currentChar >= 'a' && currentChar <= 'z') || (currentChar >= 'A' && currentChar <= 'Z') || (currentChar >= '0' && currentChar <= '9')|| currentChar == '_' || currentChar == '-')   return true;
      return false;
    }

    boolean method2(char c){
      if (c >= 'a' && c <= 'z')   return true;
      if (c >= 'A' && c <= 'Z')   return true;
      if (c >= '0' && c <= '9')   return true;
      if (c == '_' || c == '-')   return true;
      return false;
    }
}
