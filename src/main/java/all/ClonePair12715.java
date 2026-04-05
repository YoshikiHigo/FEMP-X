package all;

public class ClonePair12715 {

    String method1(String input,String tail){
      if (input == null || tail == null || !input.endsWith(tail))   return input;
      return input.substring(0,input.length() - tail.length());
    }

    String method2(String string,String separator){
      if (string == null || separator == null)   return string;
      int k=string.lastIndexOf(separator);
      if (k < 0)   return string;
     else   return string.substring(0,k);
    }
}
