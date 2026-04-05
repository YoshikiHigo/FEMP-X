package all;

public class ClonePair12027 {

    String method1(String input,String s1,String s2){
      boolean startsWith=input.startsWith(s1);
      boolean endsWith=input.endsWith(s2);
      if (!startsWith && !endsWith)   return input;
      int start=(startsWith) ? s1.length() : 0;
      int end=(endsWith) ? input.length() - s2.length() : input.length();
      return input.substring(start,end);
    }

    String method2(String text,String orig,String repl){
      int pos=0;
      while ((pos=text.indexOf(orig,pos)) >= 0) {
        text=text.substring(0,pos) + repl + text.substring(pos + orig.length(),text.length());
      }
      return text;
    }
}
