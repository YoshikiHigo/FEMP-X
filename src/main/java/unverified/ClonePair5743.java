package unverified;

public class ClonePair5743 {

    boolean method1(String str1,String str2,boolean ignoreCase){
      if (str1 == null) {
        return (str2 == null);
      }
      if (str2 == null) {
        return false;
      }
      if (ignoreCase) {
        return str1.equalsIgnoreCase(str2);
      }
     else {
        return str1.equals(str2);
      }
    }

    boolean method2(String string1,String string2,boolean caseSensitive){
      if (string1 == null)   return (string2 == null);
     else   if (string2 == null)   return false;
     else   if (string1 == string2)   return true;
      return (caseSensitive) ? string1.equals(string2) : string1.equalsIgnoreCase(string2);
    }
}
