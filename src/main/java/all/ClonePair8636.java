package all;

public class ClonePair8636 {

    boolean method1(String p1,String p2){
      if (p1 != null && p1.length() == 0)   p1=null;
      if (p2 != null && p2.length() == 0)   p2=null;
      return (p1 != null && p2 != null && p1.equals(p2));
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
