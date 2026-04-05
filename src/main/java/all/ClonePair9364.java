package all;

public class ClonePair9364 {

    int method1(String string,String other){
      if (null == string)   return 0;
      if (null == other)   return 0;
      if (0 >= string.length())   return 0;
      if (0 >= other.length())   return 0;
      int count=0;
      int index=0;
      while ((index <= string.length() - other.length()) && (-1 != (index=string.indexOf(other,index)))) {
        count++;
        index+=other.length();
      }
      return count;
    }

    int method2(String chaine,String partie){
      if ((chaine == null) || (partie == null) || (chaine.equals(""))|| (partie.equals(""))) {
        return 0;
      }
      int nb=0;
      int indice=0;
      while ((indice=chaine.indexOf(partie,indice)) >= 0) {
        indice+=partie.length();
        nb++;
      }
      return nb;
    }
}
