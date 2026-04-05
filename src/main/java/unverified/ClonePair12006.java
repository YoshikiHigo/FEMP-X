package unverified;

public class ClonePair12006 {

    String method1(String path,String search,String replacement){
      int index=path.indexOf(search);
      if (index >= 0) {
        String result=path.substring(0,index);
        result+=replacement;
        result+=path.substring(index + search.length());
        return result;
      }
     else {
        return path;
      }
    }

    String method2(String chaine,String old,String nouveau){
      String toReturn="";
      int indiceDebut=0;
      int pos=indiceDebut;
      while (chaine.indexOf(old,pos) != -1) {
        int index=chaine.indexOf(old,pos);
        toReturn+=chaine.substring(pos,index);
        toReturn+=nouveau;
        pos=index + old.length();
      }
      if (pos < chaine.length()) {
        toReturn+=chaine.substring(pos,chaine.length());
      }
      return toReturn;
    }
}
