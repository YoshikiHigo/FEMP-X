package unverified;

public class ClonePair10317 {

    String method1(String str,String s1,String s2){
      if (str.equals(s1))   return s2;
     else   if (!str.endsWith(s1))   return str;
      int pos=str.lastIndexOf(s1);
      if (pos < 0)   return str;
      return str.substring(0,str.length() - s1.length()) + s2;
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
