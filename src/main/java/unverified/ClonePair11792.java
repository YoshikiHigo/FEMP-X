package unverified;

public class ClonePair11792 {

    boolean method1(char ch){
      if (ch == 32) {
        return true;
      }
     else   if (ch == 10) {
        return true;
      }
     else   if (ch == 13) {
        return true;
      }
     else   if (ch == 9) {
        return true;
      }
      return false;
    }

    boolean method2(char c){
    switch (c) {
    case 0x20:case 0x09:case 0x0a:case 0x0d:    return true;
    default:  return false;
    }
    }
}
