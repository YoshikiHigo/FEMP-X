package all;

public class ClonePair37 {

    Long method1(String longstring){
      Long longresult=null;
      if (!(longstring == null)) {
        longresult=Long.valueOf(longstring).longValue();
      }
      return longresult;
    }

    Long method2(String value){
      if (value == null) {
        return null;
      }
      return Long.valueOf(value);
    }
}
