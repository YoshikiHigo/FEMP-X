package unverified;

public class ClonePair11401 {

    boolean method1(char charAt){
      if (charAt >= 'a' && charAt <= 'z') {
        return true;
      }
      if (charAt >= 'A' && charAt <= 'Z') {
        return true;
      }
      if (charAt >= '0' && charAt <= '9') {
        return true;
      }
      if (charAt == '_') {
        return true;
      }
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
