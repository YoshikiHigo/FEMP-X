package all;

public class ClonePair10705 {

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
      if ('a' <= c && c <= 'z') {
        return true;
      }
      if ('A' <= c && c <= 'Z') {
        return true;
      }
      if ('0' <= c && c <= '9') {
        return true;
      }
      return false;
    }
}
