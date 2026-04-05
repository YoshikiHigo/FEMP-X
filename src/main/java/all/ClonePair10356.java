package all;

public class ClonePair10356 {

    Boolean method1(String in){
      if (in != null && (in.equalsIgnoreCase("y") || in.equalsIgnoreCase("yes") || in.equalsIgnoreCase("true")|| in.equalsIgnoreCase("1")))   return Boolean.TRUE;
     else   return Boolean.FALSE;
    }

    Boolean method2(String in){
      if (in != null && (in.equalsIgnoreCase("y") || in.equalsIgnoreCase("yes") || in.equalsIgnoreCase("true")|| in.equalsIgnoreCase("1"))) {
        return Boolean.TRUE;
      }
      return Boolean.FALSE;
    }
}
