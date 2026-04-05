package all;

public class ClonePair12087 {

    boolean method1(char c){
      if ((c >= '0' && c <= '9') || c == '.')   return true;
      return false;
    }

    boolean method2(char token){
      if (token == '0' || token == '1' || token == '2' || token == '3' || token == '4' || token == '5' || token == '6' || token == '7' || token == '8' || token == '9' || token == '.') {
        return true;
      }
     else {
        return false;
      }
    }
}
