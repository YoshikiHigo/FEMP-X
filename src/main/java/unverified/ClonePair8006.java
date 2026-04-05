package unverified;

public class ClonePair8006 {

    boolean method1(String string1,String string2){
      boolean bIsEmpty1=(string1 == null || string1.length() == 0);
      boolean bIsEmpty2=(string2 == null || string2.length() == 0);
      if (bIsEmpty1 && bIsEmpty2)   return true;
      if (bIsEmpty1 || bIsEmpty2)   return false;
      return string1.equals(string2);
    }

    boolean method2(String str1,String str2){
      if (str1 == null || str1.length() == 0) {
        if (str2 == null || str2.length() == 0)     return true;
     else     return false;
      }
     else {
        if (str2 == null)     return false;
     else     return str1.equals(str2);
      }
    }
}
