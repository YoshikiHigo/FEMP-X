package unverified;

public class ClonePair8691 {

    boolean method1(String balise,String name){
      int length=balise.length();
      if (!balise.isEmpty() && balise.charAt(length - 1) == '*') {
        return name.startsWith(balise.substring(0,length - 1));
      }
     else {
        return name.equals(balise);
      }
    }

    boolean method2(String text,String prefix){
      int length=prefix.length();
      if (length > text.length())   return false;
      for (int i=0; i < length; i++) {
        char tc=Character.toLowerCase(text.charAt(i));
        char pc=Character.toLowerCase(prefix.charAt(i));
        if (tc != pc)     return false;
      }
      return true;
    }
}
