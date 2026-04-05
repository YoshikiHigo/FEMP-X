package all;

public class ClonePair7910 {

    int method1(String stringOne,String stringTwo,boolean nullIsHigh){
      int result;
      if (stringOne != null && stringTwo != null) {
        result=stringOne.compareTo(stringTwo);
      }
     else {
        if (stringOne == null && stringTwo == null) {
          result=0;
        }
     else {
          result=stringOne == null ? (nullIsHigh ? 1 : -1) : (nullIsHigh ? -1 : 1);
        }
      }
      return result;
    }

    int method2(String stringOne,String stringTwo,boolean nullIsHigh){
      int result;
      if (stringOne != null && stringTwo != null) {
        result=stringOne.compareToIgnoreCase(stringTwo);
      }
     else {
        if (stringOne == null && stringTwo == null) {
          result=0;
        }
     else {
          result=stringOne == null ? (nullIsHigh ? 1 : -1) : (nullIsHigh ? -1 : 1);
        }
      }
      return result;
    }
}
