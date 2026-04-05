package unverified;

public class ClonePair10670 {

    boolean method1(char c){
      if (((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z')) || ((c >= '0') && (c <= '9')))   return true;
     else   return false;
    }

    boolean method2(char ch){
      int asci=(int)ch;
      if (((asci >= 48) && (asci <= 57)) || ((asci >= 65) && (asci <= 90)) || ((asci >= 97) && (asci <= 122))) {
        return true;
      }
     else {
        return false;
      }
    }
}
