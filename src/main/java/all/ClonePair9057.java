package all;

public class ClonePair9057 {

    boolean method1(char c){
      if (c >= 'a' && c <= 'z')   return true;
      if (c >= 'A' && c <= 'Z')   return true;
      if (c == '_')   return true;
      if (c >= '0' && c <= '9')   return true;
      return false;
    }

    boolean method2(char testChar_){
      if ((testChar_ == '_') || ((testChar_ >= 'A') && (testChar_ <= 'Z')) || ((testChar_ >= 'a') && (testChar_ <= 'z'))|| ((testChar_ >= '0') && (testChar_ <= '9'))) {
        return true;
      }
     else {
        return false;
      }
    }
}
