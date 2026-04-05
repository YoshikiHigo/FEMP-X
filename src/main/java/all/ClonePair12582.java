package all;

public class ClonePair12582 {

    boolean method1(int lowerBound,int value,int upperBound){
      if (lowerBound >= value)   return false;
      if (upperBound <= value)   return false;
      return true;
    }

    boolean method2(int destination,int source,int length){
      if (source + length <= destination || destination + length <= source) {
        return false;
      }
      return true;
    }
}
