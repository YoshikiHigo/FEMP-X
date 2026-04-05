package all;

public class ClonePair3745 {

    boolean method1(String a,String b){
      if (a != null && a.trim().length() == 0)   a=null;
      if (b != null && b.trim().length() == 0)   b=null;
      boolean rt=false;
      if (a == b)   return true;
      if (a != null && b != null) {
        if (a.compareTo(b) == 0) {
          return true;
        }
      }
      return rt;
    }

    boolean method2(String string1,String string2){
      boolean bIsEmpty1=(string1 == null || string1.length() == 0);
      boolean bIsEmpty2=(string2 == null || string2.length() == 0);
      if (bIsEmpty1 && bIsEmpty2)   return true;
      if (bIsEmpty1 || bIsEmpty2)   return false;
      return string1.equals(string2);
    }
}
