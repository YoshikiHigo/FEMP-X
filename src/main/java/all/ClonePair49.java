package all;

public class ClonePair49 {

    Long method1(String str){
      if (str == null)   return null;
      return Long.parseLong(str);
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
