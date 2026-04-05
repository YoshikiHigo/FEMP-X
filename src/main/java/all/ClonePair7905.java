package all;

public class ClonePair7905 {

    boolean method1(String a1,String a2){
      if (a1 == null || a2 == null || a1.length() == 0 || a2.length() == 0) {
        return true;
      }
      String stripped_title1=a1.replaceAll("[\\s,.\\-]","").toUpperCase();
      String stripped_title2=a2.replaceAll("[\\s,.\\-]","").toUpperCase();
      return stripped_title1.equals(stripped_title2);
    }

    boolean method2(String s1,String s2){
      if (s1 == null || s2 == null || s1.length() == 0 || s2.length() == 0) {
        return true;
      }
      return s1.equals(s2);
    }
}
