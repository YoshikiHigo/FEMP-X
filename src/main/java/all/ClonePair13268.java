package all;

public class ClonePair13268 {

    boolean method1(String input){
      if (input.contains("/") || input.contains("\\") || input.contains(":")|| input.contains("*")|| input.contains("?")|| input.contains("\"")|| input.contains("<")|| input.contains(">")|| input.contains("|"))   return true;
      return false;
    }

    boolean method2(String option){
      if (option.length() == 0) {
        return false;
      }
      if (option.charAt(0) != '-') {
        return true;
      }
      return false;
    }
}
