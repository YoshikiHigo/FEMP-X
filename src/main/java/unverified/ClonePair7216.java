package unverified;

public class ClonePair7216 {

    boolean method1(String title1,String title2){
      if ((title1 == null) || (title2 == null)) {
        return false;
      }
      if ((title1.length() == 0) || (title2.length() == 0)) {
        return false;
      }
      if (Character.toUpperCase(title1.charAt(0)) != Character.toUpperCase(title2.charAt(0))) {
        return false;
      }
      return title1.substring(1).equals(title2.substring(1));
    }

    boolean method2(String p1,String p2){
      if (p1 != null && p1.length() == 0)   p1=null;
      if (p2 != null && p2.length() == 0)   p2=null;
      return (p1 != null && p2 != null && p1.equals(p2));
    }
}
