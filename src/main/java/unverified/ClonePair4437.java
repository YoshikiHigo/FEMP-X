package unverified;

public class ClonePair4437 {

    boolean method1(String s1,String s2){
      if (s1 == null)   return ((s2 == null) || s2.equals(""));
      if (s2 == null)   return (s1.equals(""));
      return (s1.equalsIgnoreCase(s2));
    }

    boolean method2(String string1,String string2){
      boolean bIsEmpty1=(string1 == null || string1.length() == 0);
      boolean bIsEmpty2=(string2 == null || string2.length() == 0);
      if (bIsEmpty1 && bIsEmpty2)   return true;
      if (bIsEmpty1 || bIsEmpty2)   return false;
      return string1.equals(string2);
    }
}
