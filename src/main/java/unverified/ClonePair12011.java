package unverified;

public class ClonePair12011 {

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

    String method2(String text,String orig,String repl){
      int pos=0;
      while ((pos=text.indexOf(orig,pos)) >= 0) {
        text=text.substring(0,pos) + repl + text.substring(pos + orig.length(),text.length());
      }
      return text;
    }
}
