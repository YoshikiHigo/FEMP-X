package all;

public class ClonePair11926 {

    boolean method1(char c){
      if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == '_')   return true;
     else   return false;
    }

    boolean method2(char c){
      if (c >= 'a' && c <= 'z')   return true;
      if (c >= 'A' && c <= 'Z')   return true;
      if (c == '_')   return true;
      return false;
    }
}
