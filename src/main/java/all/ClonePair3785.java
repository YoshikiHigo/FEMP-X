package all;

public class ClonePair3785 {

    boolean method1(String prefix,String string){
      int index1=0;
      int index2=0;
      int length1=prefix.length();
      int length2=string.length();
      char ch1=' ';
      char ch2=' ';
      while (index1 < length1 && index2 < length2) {
        while (index1 < length1 && Character.isWhitespace(ch1=prefix.charAt(index1))) {
          index1++;
        }
        while (index2 < length2 && Character.isWhitespace(ch2=string.charAt(index2))) {
          index2++;
        }
        if (index1 == length1 && index2 == length2) {
          return true;
        }
        if (ch1 != ch2) {
          return false;
        }
        index1++;
        index2++;
      }
      if (index1 < length1 && index2 >= length2)   return false;
      return true;
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
