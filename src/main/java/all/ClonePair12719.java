package all;

public class ClonePair12719 {

    String method1(String input,String tail){
      if (input == null || tail == null || !input.endsWith(tail))   return input;
      return input.substring(0,input.length() - tail.length());
    }

    String method2(String text,String separator){
      int index;
      if ((text == null) || (separator == null)) {
        return text;
      }
      index=text.lastIndexOf(separator);
      if (index < 0) {
        return text;
      }
      return text.substring(0,index);
    }
}
