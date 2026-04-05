package unverified;

public class ClonePair12707 {

    String method1(String input,String tail){
      if (input == null || tail == null || !input.endsWith(tail))   return input;
      return input.substring(0,input.length() - tail.length());
    }

    String method2(String s,String strToRemove){
      if (s == null || strToRemove == null)   return s;
      if (s.length() < strToRemove.length())   return s;
      int subLoc=s.length() - strToRemove.length();
      if (s.substring(subLoc).equalsIgnoreCase(strToRemove))   return s.substring(0,subLoc);
      return s;
    }
}
