package all;

public class ClonePair4406 {

    boolean method1(char[] testChar_){
      if (testChar_.length != 3)   return false;
      if ((testChar_[0] == '-') && (testChar_[1] == '-') && (testChar_[1] == '>')) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(char[] testChar_){
      if (testChar_.length != 4)   return false;
      if ((testChar_[0] == '<') && (testChar_[1] == '!') && (testChar_[1] == '-')&& (testChar_[1] == '-')) {
        return true;
      }
     else {
        return false;
      }
    }
}
