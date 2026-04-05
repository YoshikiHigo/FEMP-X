package all;

public class ClonePair11791 {

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

    boolean method2(char ch){
      if (ch > 0x20)   return false;
      return ch == 0x9 || ch == 0xA || ch == 0xD || ch == 0x20;
    }
}
