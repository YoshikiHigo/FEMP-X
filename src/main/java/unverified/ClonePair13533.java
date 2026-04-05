package unverified;

public class ClonePair13533 {

    String method1(String or,String ac,String ne){
      int orl=or.length();
      int acl=ac.length();
      StringBuilder resB=new StringBuilder();
      if (acl <= orl && or.lastIndexOf(ac) == orl - acl)   return resB.append(or.substring(0,or.length() - ac.length())).append(ne).toString();
      return or;
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
