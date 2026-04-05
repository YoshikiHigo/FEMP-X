package all;

public class ClonePair5687 {

    boolean method1(String s1,String s2,boolean trim){
      if (s1 == null && s2 == null) {
        return true;
      }
      if (s1 == null || s2 == null) {
        return false;
      }
      if (trim) {
        return s1.trim().equals(s2.trim());
      }
      return s1.equals(s2);
    }

    boolean method2(String string1,String string2,boolean caseSensitive){
      if (string1 == null)   return (string2 == null);
     else   if (string2 == null)   return false;
     else   if (string1 == string2)   return true;
      return (caseSensitive) ? string1.equals(string2) : string1.equalsIgnoreCase(string2);
    }
}
