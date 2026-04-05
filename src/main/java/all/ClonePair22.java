package all;

public class ClonePair22 {

    Long method1(String t){
      if (t != null) {
        return Long.parseLong(t);
      }
      return null;
    }

    Long method2(String longstring){
      Long longresult=null;
      if (!(longstring == null)) {
        longresult=Long.valueOf(longstring).longValue();
      }
      return longresult;
    }
}
