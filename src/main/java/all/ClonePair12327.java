package all;

public class ClonePair12327 {

    boolean method1(String text){
      char ch;
      text=text.toUpperCase();
      boolean retVal=true;
      for (int i=0; i < text.length(); i++) {
        ch=text.charAt(i);
        if (!((ch >= 'A' && ch <= 'Z') || (ch == ' ' || ch == '.' || ch == ',')))     retVal=false;
      }
      return retVal;
    }

    boolean method2(String input){
      if (input.indexOf("/") > -1)   return false;
      if (input.indexOf("*") > -1)   return false;
      try {
        Class.forName(input);
      }
     catch (  ClassNotFoundException e) {
        return false;
      }
      return true;
    }
}
