package unverified;

public class ClonePair11684 {

    String method1(String a_content,String a_regex,String a_replace){
      if (a_content == null) {
        return null;
      }
      String l_content=null;
      String retour=a_content;
      while (!retour.equals(l_content)) {
        l_content=retour;
        retour=l_content.replaceAll(a_regex,a_replace);
      }
      return retour;
    }

    String method2(String original,String regex,String replacement){
      String result=null;
      if (original != null) {
        result=original.replaceAll(regex,replacement);
      }
      return result;
    }
}
