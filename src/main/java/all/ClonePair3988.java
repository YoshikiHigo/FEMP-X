package all;

public class ClonePair3988 {

    boolean method1(String uri1,String uri2){
      if (uri1 == uri2) {
        return true;
      }
      if (uri1 == null) {
        return (uri2.length() == 0);
      }
      if (uri2 == null) {
        return (uri1.length() == 0);
      }
      return uri1.equals(uri2);
    }

    boolean method2(String string1,String string2){
      boolean bIsEmpty1=(string1 == null || string1.length() == 0);
      boolean bIsEmpty2=(string2 == null || string2.length() == 0);
      if (bIsEmpty1 && bIsEmpty2)   return true;
      if (bIsEmpty1 || bIsEmpty2)   return false;
      return string1.equals(string2);
    }
}
