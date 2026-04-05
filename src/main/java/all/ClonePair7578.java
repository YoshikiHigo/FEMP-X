package all;

public class ClonePair7578 {

    String method1(int _val){
      if (_val < 100) {
        if (_val < 10) {
          return "00" + _val;
        }
        return "0" + _val;
      }
      return "" + _val;
    }

    String method2(int n){
      if (n <= 9) {
        return "00" + n;
      }
     else   if (n <= 99) {
        return "0" + n;
      }
     else {
        return "" + n;
      }
    }
}
