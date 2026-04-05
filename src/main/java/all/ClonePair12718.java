package all;

public class ClonePair12718 {

    String method1(String input,String tail){
      if (input == null || tail == null || !input.endsWith(tail))   return input;
      return input.substring(0,input.length() - tail.length());
    }

    String method2(String text,String suffix){
      if (text == null) {
        return null;
      }
      if (suffix == null) {
        return text;
      }
      if (text.endsWith(suffix)) {
        return text.substring(0,text.length() - suffix.length());
      }
      return text;
    }
}
