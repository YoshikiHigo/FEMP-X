package unverified;

public class ClonePair7165 {

    boolean method1(String s1,String s2){
      if ((s1 == null || s1.length() == 0) && (s2 == null || s2.length() == 0)) {
        return true;
      }
      return s1 != null && s2 != null && s1.equals(s2);
    }

    boolean method2(String string1,String string2){
      boolean bIsEmpty1=(string1 == null || string1.length() == 0);
      boolean bIsEmpty2=(string2 == null || string2.length() == 0);
      if (bIsEmpty1 && bIsEmpty2)   return true;
      if (bIsEmpty1 || bIsEmpty2)   return false;
      return string1.equals(string2);
    }
}
