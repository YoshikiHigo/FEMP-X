package unverified;

public class ClonePair7065 {

    boolean method1(String s1,String s2){
      if (s1 == null)   return (s2 == null || s2.trim().equals("") || s2.equals("\n"));
      if (s2 == null)   return s1.trim().equals("") || s1.equals("\n");
      return s1.trim().equals(s2.trim());
    }

    boolean method2(String string1,String string2){
      if (string1 == null) {
        return string2 == null || string2.length() == 0;
      }
      if (string2 == null) {
        return string1.length() == 0;
      }
      return string1.equalsIgnoreCase(string2);
    }
}
