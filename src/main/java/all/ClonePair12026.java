package all;

public class ClonePair12026 {

    String method1(String input,String s1,String s2){
      boolean startsWith=input.startsWith(s1);
      boolean endsWith=input.endsWith(s2);
      if (!startsWith && !endsWith)   return input;
      int start=(startsWith) ? s1.length() : 0;
      int end=(endsWith) ? input.length() - s2.length() : input.length();
      return input.substring(start,end);
    }

    String method2(String title,String lb,String rb){
      if (title.startsWith(lb) && title.endsWith(rb)) {
        title=title.substring(lb.length(),title.length() - rb.length());
        title=title.trim();
      }
      return title;
    }
}
