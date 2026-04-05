package all;

public class ClonePair10703 {

    boolean method1(char ch){
      int asci=(int)ch;
      if (((asci >= 48) && (asci <= 57)) || ((asci >= 65) && (asci <= 90)) || ((asci >= 97) && (asci <= 122))) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(char c){
      if (((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z')) || ((c >= '0') && (c <= '9'))) {
        return true;
      }
     else   return false;
    }
}
