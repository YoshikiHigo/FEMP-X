package all;

public class ClonePair11263 {

    int method1(String str,String sub){
      if (str == null || sub == null || str.length() == 0 || sub.length() == 0) {
        return 0;
      }
      int count=0;
      int pos=0;
      int idx;
      while ((idx=str.indexOf(sub,pos)) != -1) {
        ++count;
        pos=idx + sub.length();
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
