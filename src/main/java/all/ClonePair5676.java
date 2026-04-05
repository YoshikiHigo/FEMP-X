package all;

public class ClonePair5676 {

    boolean method1(String s1,String s2,boolean ignoreCase){
      if (s1 == s2) {
        return true;
      }
      if (s1 == null) {
        return false;
      }
      if (s2 == null) {
        return false;
      }
      if (ignoreCase) {
        return s1.equalsIgnoreCase(s2);
      }
     else {
        return s1.equals(s2);
      }
    }

    boolean method2(String string1,String string2,boolean caseSensitive){
      if (string1 == null)   return (string2 == null);
     else   if (string2 == null)   return false;
     else   if (string1 == string2)   return true;
      return (caseSensitive) ? string1.equals(string2) : string1.equalsIgnoreCase(string2);
    }
}
