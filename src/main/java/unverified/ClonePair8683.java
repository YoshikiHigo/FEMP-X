package unverified;

public class ClonePair8683 {

    boolean method1(String balise,String name){
      int length=balise.length();
      if (!balise.isEmpty() && balise.charAt(length - 1) == '*') {
        return name.startsWith(balise.substring(0,length - 1));
      }
     else {
        return name.equals(balise);
      }
    }

    boolean method2(String name1,String name2){
      int nameLen=name1.length();
      if (nameLen != name2.length()) {
        return false;
      }
      for (int i=nameLen - 1; i >= 0; i--) {
        char c1=name1.charAt(i);
        char c2=name2.charAt(i);
        if (c1 != c2) {
          if (c1 >= 'A' && c1 <= 'Z') {
            c1+=32;
          }
          if (c2 >= 'A' && c2 <= 'Z') {
            c2+=32;
          }
          if (c1 != c2) {
            return false;
          }
        }
      }
      return true;
    }
}
