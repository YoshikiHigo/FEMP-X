package unverified;

public class ClonePair7875 {

    boolean method1(String day,String end){
      if (end.equals(""))   return true;
      if (day.compareToIgnoreCase(end) == 0)   return true;
      return false;
    }

    boolean method2(String balise,String name){
      int length=balise.length();
      if (!balise.isEmpty() && balise.charAt(length - 1) == '*') {
        return name.startsWith(balise.substring(0,length - 1));
      }
     else {
        return name.equals(balise);
      }
    }
}
