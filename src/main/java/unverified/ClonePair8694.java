package unverified;

public class ClonePair8694 {

    boolean method1(String balise,String name){
      int length=balise.length();
      if (!balise.isEmpty() && balise.charAt(length - 1) == '*') {
        return name.startsWith(balise.substring(0,length - 1));
      }
     else {
        return name.equals(balise);
      }
    }

    boolean method2(String s1,String s2){
      if (s1.length() < s2.length())   return false;
      for (int i=0; i < s2.length(); i++) {
        char c1=s1.charAt(i), c2=s2.charAt(i);
        if (c1 != c2 && Character.toLowerCase(c2) != c1 && Character.toUpperCase(c2) != c1)     return false;
      }
      return true;
    }
}
