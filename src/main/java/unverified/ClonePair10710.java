package unverified;

public class ClonePair10710 {

    boolean method1(char ch){
      int asci=(int)ch;
      if (((asci >= 48) && (asci <= 57)) || ((asci >= 65) && (asci <= 90)) || ((asci >= 97) && (asci <= 122))) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(char ch){
      if ((ch >= '0') && (ch <= '9')) {
        return true;
      }
      if ((ch >= 'A') && (ch <= 'Z')) {
        return true;
      }
      if ((ch >= 'a') && (ch <= 'z')) {
        return true;
      }
      return false;
    }
}
