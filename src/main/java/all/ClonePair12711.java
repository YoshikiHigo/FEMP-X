package all;

public class ClonePair12711 {

    String method1(String input,String tail){
      if (input == null || tail == null || !input.endsWith(tail))   return input;
      return input.substring(0,input.length() - tail.length());
    }

    String method2(String s,String suffix){
      if (s == null || s.length() == 0 || suffix == null || suffix.length() == 0)   return s;
      if (s.endsWith(suffix)) {
        return s.substring(0,s.length() - suffix.length());
      }
     else   return s;
    }
}
