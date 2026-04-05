package all;

public class ClonePair11806 {

    boolean method1(char currentChar){
      if ((currentChar >= 'a' && currentChar <= 'z') || (currentChar >= 'A' && currentChar <= 'Z') || (currentChar >= '0' && currentChar <= '9')|| currentChar == '_' || currentChar == '.' || currentChar == ':' || currentChar == '-')   return true;
      return false;
    }

    boolean method2(char c){
      if ((c >= 0x61 && c <= 0x7a) || (c >= 0x41 && c <= 0x5a) || (c >= 0x30 && c <= 0x3a)|| c == '.' || c == '-' || c == '_')   return true;
      if (c < 128)   return false;
      return Character.isLetterOrDigit(c);
    }
}
