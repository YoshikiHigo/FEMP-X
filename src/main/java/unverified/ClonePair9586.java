package unverified;

public class ClonePair9586 {

    boolean method1(char c){
      if ((c >= 65 && c < 91) || (c >= 97 && c < 123)) {
        return true;
      }
     else   if (c >= 48 && c <= 57) {
        return true;
      }
     else {
        return false;
      }
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
