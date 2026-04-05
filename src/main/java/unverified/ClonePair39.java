package unverified;

public class ClonePair39 {

    Long method1(String longstring){
      Long longresult=null;
      if (!(longstring == null)) {
        longresult=Long.valueOf(longstring).longValue();
      }
      return longresult;
    }

    Long method2(String number){
      if (number == null) {
        return null;
      }
     else {
        return new Long(number);
      }
    }
}
