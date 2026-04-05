package all;

public class ClonePair5949 {

    boolean method1(String pattern,String str){
      if (pattern.equals("*")) {
        return true;
      }
     else   if (pattern.startsWith("*")) {
        if (pattern.endsWith("*")) {
          if (pattern.length() == 2)       return true;
          return str.indexOf(pattern.substring(1,pattern.length() - 1)) >= 0;
        }
        return str.endsWith(pattern.substring(1));
      }
     else   if (pattern.endsWith("*")) {
        return str.startsWith(pattern.substring(0,pattern.length() - 1));
      }
     else {
        return str.equals(pattern);
      }
    }

    boolean method2(String balise,String name){
      int length=balise.length();
      if (!balise.isEmpty() && balise.charAt(length - 1) == '*') {
        return name.startsWith(balise.substring(0,length - 1));
      }
     else {
        return name.equals(balise);
      }
    }
}
