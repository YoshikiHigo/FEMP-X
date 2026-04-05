package all;

import java.util.Set;

public class ClonePair3972 {

    double method1(Set<String> reqSet,Set<String> offSet){
      double rValue=Double.parseDouble((String)reqSet.toArray()[0]);
      double oValue=Double.parseDouble((String)offSet.toArray()[0]);
      if (rValue <= oValue) {
        return 1 - Math.exp(-Math.pow((rValue - oValue),2) / (Math.pow(rValue,2) + 1)) + Double.MIN_VALUE;
      }
     else {
        return 0;
      }
    }

    double method2(Set<String> reqSet,Set<String> offSet){
      double rValue=Double.parseDouble((String)reqSet.toArray()[0]);
      double oValue=Double.parseDouble((String)offSet.toArray()[0]);
      if (rValue >= oValue) {
        return 1 - Math.exp(-Math.pow((rValue - oValue),2) / (Math.pow(rValue,2) + 1)) + Double.MIN_VALUE;
      }
     else {
        return 0;
      }
    }
}
