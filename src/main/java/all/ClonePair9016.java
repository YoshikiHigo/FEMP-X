package all;

public class ClonePair9016 {

    boolean method1(char c){
      if (c >= 'a' && c <= 'z')   return true;
      if (c >= 'A' && c <= 'Z')   return true;
      if (c >= '0' && c <= '9')   return true;
      return c == '_';
    }

    boolean method2(char c){
      if (c >= 'a' && c <= 'z')   return true;
      if (c >= 'A' && c <= 'Z')   return true;
      if (c == '_')   return true;
      if (c >= '0' && c <= '9')   return true;
      return false;
    }
}
