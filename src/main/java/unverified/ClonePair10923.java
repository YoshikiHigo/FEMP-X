package unverified;

public class ClonePair10923 {

    String method1(String input,int limit,String elipsis){
      if (input == null)   return null;
      if (input.length() > limit) {
        String result=input.substring(0,limit);
        if (elipsis != null)     result+=elipsis;
        return result;
      }
     else   return input;
    }

    String method2(String string,int maximumLength,String suffix){
      if (string == null) {
        return string;
      }
      int stringLength=string.length();
      if (stringLength <= maximumLength) {
        return string;
      }
      return string.substring(0,maximumLength) + (suffix == null ? "" : suffix);
    }
}
