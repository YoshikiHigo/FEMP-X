package all;

public class ClonePair3165 {

    boolean method1(String range,Integer val){
      String boundries[]=range.split("-");
      if (val < new Integer(boundries[0]) || val > new Integer(boundries[1]))   return false;
     else   return true;
    }

    boolean method2(String range,Integer val){
      String boundries[]=range.split("-");
      if (val < new Integer(boundries[0]) || val > new Integer(boundries[1])) {
        return false;
      }
     else {
        return true;
      }
    }
}
