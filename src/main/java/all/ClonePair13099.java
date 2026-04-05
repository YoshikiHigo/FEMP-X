package all;

public class ClonePair13099 {

    String method1(String source,String from,String to){
      StringBuffer sb=new StringBuffer();
      int oldIndex=0, newIndex;
      while (-1 != (newIndex=source.indexOf(from,oldIndex))) {
        sb.append(source.substring(oldIndex,newIndex)).append(to);
        oldIndex=newIndex + from.length();
      }
      if (oldIndex < source.length())   sb.append(source.substring(oldIndex));
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
