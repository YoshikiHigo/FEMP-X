package all;

public class ClonePair5752 {

    boolean method1(int c){
      if (c <= 'Z') {
        return 'A' <= c;
      }
     else {
        return 'a' <= c && c <= 'z';
      }
    }

    boolean method2(int d){
      if ((d < 123 && d > 96) || (d < 91 && d > 64))   return true;
      return false;
    }
}
