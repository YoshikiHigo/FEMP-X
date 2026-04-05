package all;

public class ClonePair8965 {

    boolean method1(String simTypePattern,String simulationType){
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

    boolean method2(String s,String start){
      if ((s == null) || (start == null)) {
        return false;
      }
      if (start.length() > s.length()) {
        return false;
      }
      String temp=s.substring(0,start.length());
      if (temp.equalsIgnoreCase(start)) {
        return true;
      }
     else {
        return false;
      }
    }
}
