package all;

public class ClonePair12918 {

    long method1(String paramName){
      if (paramName == null || "".equals(paramName)) {
        return 0L;
      }
     else {
        return Long.parseLong(paramName);
      }
    }

    long method2(String srcValue){
      if (srcValue == null || srcValue.toString().equals(""))   return 0;
      return Integer.parseInt(srcValue);
    }
}
