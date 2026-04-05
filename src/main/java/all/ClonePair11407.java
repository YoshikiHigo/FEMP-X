package all;

public class ClonePair11407 {

    String method1(String s,String a_find,String a_replace,int a_start){
      if (s == null) {
        return null;
      }
      int index=s.indexOf(a_find,a_start);
      if (index == -1) {
        return s;
      }
      int nbCharFind=a_find.length();
      int nbCharTot=s.length();
      String l_before=s.substring(0,index);
      String l_after="";
      int nbCharAfter=nbCharTot - index - nbCharFind;
      if (nbCharAfter > 0) {
        l_after=s.substring(nbCharTot - nbCharAfter,nbCharTot);
      }
      String retour=l_before + a_replace + l_after;
      return retour;
    }

    String method2(String text,String repl,String with,int max){
      if (text == null) {
        return null;
      }
      StringBuffer buffer=new StringBuffer(text.length());
      int start=0;
      int end=0;
      while ((end=text.indexOf(repl,start)) != -1) {
        buffer.append(text.substring(start,end)).append(with);
        start=end + repl.length();
        if (--max == 0) {
          break;
        }
      }
      buffer.append(text.substring(start));
      return buffer.toString();
    }
}
