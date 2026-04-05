package unverified;

public class ClonePair12373 {

    String method1(String string,String placeholder,String replacement){
      if (string == null) {
        return string;
      }
      int loc=string.indexOf(placeholder);
      if (loc < 0) {
        return string;
      }
     else {
        return new StringBuilder(string.substring(0,loc)).append(replacement).append(string.substring(loc + placeholder.length())).toString();
      }
    }

    String method2(String s,String s1,String s2){
      if (s == null)   return s;
      int i=-1;
      for (int j=s.indexOf(s1); j != -1 && i != 0; i--) {
        s=s.substring(0,j) + s2 + s.substring(j + s1.length());
        j=s.indexOf(s1,j + s2.length());
      }
      return s;
    }
}
