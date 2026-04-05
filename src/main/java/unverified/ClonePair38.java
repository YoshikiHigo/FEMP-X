package unverified;

public class ClonePair38 {

    Long method1(String longstring){
      Long longresult=null;
      if (!(longstring == null)) {
        longresult=Long.valueOf(longstring).longValue();
      }
      return longresult;
    }

    Long method2(String str){
      if (str == null)   return null;
      return Long.parseLong(str);
    }
}
