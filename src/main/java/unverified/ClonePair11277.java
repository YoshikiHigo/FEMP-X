package unverified;

public class ClonePair11277 {

    int method1(String str,String sub){
      if (str == null || str.length() == 0 || sub == null || sub.length() == 0) {
        return 0;
      }
      int count=0;
      int idx=0;
      while ((idx=str.indexOf(sub,idx)) != -1) {
        count++;
        idx+=sub.length();
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
