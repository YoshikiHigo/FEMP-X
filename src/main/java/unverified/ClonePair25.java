package unverified;

public class ClonePair25 {

    Long method1(String t){
      if (t != null) {
        return Long.parseLong(t);
      }
      return null;
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
