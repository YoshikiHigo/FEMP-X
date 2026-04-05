package unverified;

public class ClonePair7883 {

    boolean method1(String day,String end){
      if (end.equals(""))   return true;
      if (day.compareToIgnoreCase(end) == 0)   return true;
      return false;
    }

    boolean method2(String string1,String string2){
      if (string2.length() != string1.length())   return (false);
      for (int i=0; i < string2.length(); i++) {
        if (Character.toLowerCase(string1.charAt(i)) != Character.toLowerCase(string2.charAt(i)))     return (false);
      }
      return (true);
    }
}
