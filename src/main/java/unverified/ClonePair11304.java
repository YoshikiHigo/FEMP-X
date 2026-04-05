package unverified;

public class ClonePair11304 {

    int method1(String source,String find){
      if (source == null || source.length() == 0 || find == null || find.length() == 0) {
        return 0;
      }
      int count=0;
      int pos=source.indexOf(find,0);
      while (pos != -1) {
        ++count;
        pos=source.indexOf(find,pos + 1);
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
