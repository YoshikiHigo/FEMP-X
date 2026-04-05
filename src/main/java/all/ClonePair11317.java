package all;

public class ClonePair11317 {

    int method1(String chaine,String partie){
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
