package all;

public class ClonePair11662 {

    String method1(String in,String what,String with){
      int pos=0, lp=0;
      StringBuffer sb=new StringBuffer();
      while ((pos=in.indexOf(what,lp)) > -1) {
        sb.append(in.substring(lp,pos));
        sb.append(with);
        lp=pos + what.length();
      }
      if (lp < in.length()) {
        sb.append(in.substring(lp));
      }
      return sb.toString();
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
