package all;

public class ClonePair8420 {

    boolean method1(String source,String begin){
      System.out.println("currURL = '" + source + "', begin = '"+ begin+ "'");
      for (int i=0; i < begin.length(); i++) {
        char c1=source.charAt(i);
        char c2=begin.charAt(i);
        if (c1 != c2) {
          System.out.println("Negatif");
          return false;
        }
      }
      return true;
    }

    boolean method2(String source,String begin){
      for (int i=0; i < begin.length(); i++) {
        char c1=source.charAt(i);
        char c2=begin.charAt(i);
        if (c1 != c2) {
          return false;
        }
      }
      return true;
    }
}
