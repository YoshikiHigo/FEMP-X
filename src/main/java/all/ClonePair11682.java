package all;

public class ClonePair11682 {

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

    String method2(String s,String from,String to){
      if (s == null) {
        return null;
      }
      s=s.replaceAll(from,to);
      return s;
    }
}
