package all;

public class ClonePair9171 {

    int method1(String string,String sub){
      if (string == null || string.length() == 0 || sub == null || sub.length() == 0)   return 0;
      int count=0;
      int index=0;
      while ((index=string.indexOf(sub,index)) != -1) {
        count++;
        index+=sub.length();
      }
      return count;
    }

    int method2(String chaine,String partie){
      if (chaine == null || partie == null || chaine.equals("") || partie.equals("")) {
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
