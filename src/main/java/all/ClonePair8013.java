package all;

public class ClonePair8013 {

    boolean method1(String string1,String string2){
      boolean bIsEmpty1=(string1 == null || string1.length() == 0);
      boolean bIsEmpty2=(string2 == null || string2.length() == 0);
      if (bIsEmpty1 && bIsEmpty2)   return true;
      if (bIsEmpty1 || bIsEmpty2)   return false;
      return string1.equals(string2);
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
