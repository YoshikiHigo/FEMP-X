package unverified;

public class ClonePair3773 {

    boolean method1(String prefix,String string){
      int index1=0;
      int index2=0;
      int length1=prefix.length();
      int length2=string.length();
      char ch1=' ';
      char ch2=' ';
      while (index1 < length1 && index2 < length2) {
        while (index1 < length1 && Character.isWhitespace(ch1=prefix.charAt(index1))) {
          index1++;
        }
        while (index2 < length2 && Character.isWhitespace(ch2=string.charAt(index2))) {
          index2++;
        }
        if (index1 == length1 && index2 == length2) {
          return true;
        }
        if (ch1 != ch2) {
          return false;
        }
        index1++;
        index2++;
      }
      if (index1 < length1 && index2 >= length2)   return false;
      return true;
    }

    boolean method2(String sub,String s){
      if (sub.length() != s.length())   return false;
      char[] csub=sub.toCharArray();
      char[] c=s.toCharArray();
      for (int i=0; i < csub.length; i++) {
        if (csub[i] != '0' && c[i] == '0')     return false;
      }
      return true;
    }
}
