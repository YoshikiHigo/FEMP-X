package unverified;

public class ClonePair11161 {

    int method1(String source,String match){
      int count=0;
      if (source != null && match != null && match.length() > 0) {
        int currPos=0;
        while (source.length() >= currPos && (currPos=source.indexOf(match,currPos)) > -1) {
          currPos++;
          count++;
        }
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
