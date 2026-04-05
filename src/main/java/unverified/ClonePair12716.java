package unverified;

public class ClonePair12716 {

    String method1(String input,String tail){
      if (input == null || tail == null || !input.endsWith(tail))   return input;
      return input.substring(0,input.length() - tail.length());
    }

    String method2(String sSource,String sEndsWith){
      if (null == sSource)   return null;
     else   if (sEndsWith == null)   return sSource;
     else   if (sSource.length() < sEndsWith.length())   return sSource;
     else   if (sSource.endsWith(sEndsWith))   return sSource.substring(0,sSource.length() - sEndsWith.length());
     else   return sSource;
    }
}
