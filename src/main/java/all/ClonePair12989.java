package all;

public class ClonePair12989 {

    long method1(String value){
      if (value == null || value.length() == 0) {
        return 0;
      }
      return Long.parseLong(value);
    }

    long method2(String srcValue){
      if (srcValue == null || srcValue.toString().equals(""))   return 0;
      return Integer.parseInt(srcValue);
    }
}
