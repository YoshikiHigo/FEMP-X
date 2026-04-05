package unverified;

public class ClonePair7215 {

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

    boolean method2(String source,String identifer){
      if (source == null || "".equals(source)) {
        return false;
      }
      if (identifer == null || "".equals(identifer)) {
        return false;
      }
      return source.startsWith(identifer);
    }
}
