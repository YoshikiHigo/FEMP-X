package all;

public class ClonePair6669 {

    boolean method1(String value1,String value2){
      try {
        if (value1 == null || value2 == null) {
          return false;
        }
     else     if (value1.trim().length() == 0 || value2.trim().length() == 0) {
          return false;
        }
     else {
          return value1.equals(value2);
        }
      }
     catch (  Exception e) {
        return false;
      }
    }

    boolean method2(String simTypePattern,String simulationType){
      int len=simTypePattern != null ? simTypePattern.length() : 0;
      if (len == 0) {
        return false;
      }
     else   if (simTypePattern.charAt(len - 1) == '*') {
        return simulationType != null && simulationType.regionMatches(0,simTypePattern,0,len - 1);
      }
     else {
        return simTypePattern.equals(simulationType);
      }
    }
}
