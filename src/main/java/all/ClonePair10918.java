package all;

public class ClonePair10918 {

    String method1(String s,String value){
      if (s != null && s.startsWith(value)) {
        s=s.substring(value.length());
      }
      if (s != null && s.endsWith(value)) {
        s=s.substring(0,s.length() - value.length());
      }
      return s;
    }

    String method2(String s,String tail){
      if (s != null && s.endsWith(tail)) {
        return s.substring(0,s.length() - tail.length());
      }
     else {
        return s;
      }
    }
}
