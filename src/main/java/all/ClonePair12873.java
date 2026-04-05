package all;

public class ClonePair12873 {

    String method1(String _text,int maxLineLength){
      StringBuffer broken=new StringBuffer(_text.length() + 10);
      boolean needBreak=false;
      for (int i=0; i < _text.length(); i++) {
        if (i > 0 && i % maxLineLength == 0)     needBreak=true;
        final char c=_text.charAt(i);
        if (needBreak && Character.isWhitespace(c)) {
          System.out.println("Breaking: " + broken.toString());
          needBreak=false;
          broken.append('\n');
        }
     else {
          broken.append(c);
        }
      }
      System.out.println("Broken! " + broken.toString());
      return broken.toString();
    }

    String method2(String longString,int maxLength){
      System.out.println("--1");
      int len=longString.length();
      if (len <= maxLength)   return longString;
     else {
        System.out.println("--2");
        int first=len / 2;
        int second=first;
        for (int i=first - 1; i >= 0; i--) {
          System.out.println("--3");
          if (longString.charAt(i) == '\\' || longString.charAt(i) == '/') {
            System.out.println("--4");
            first=i;
            break;
          }
        }
        for (int i=second + 1; i < len; i++) {
          System.out.println("--5");
          if (longString.charAt(i) == '\\' || longString.charAt(i) == '/') {
            System.out.println("--6");
            second=i;
            break;
          }
        }
        loop:     while ((len - (second - first)) > maxLength) {
          System.out.println("--7");
          out:       for (int i=first - 1; i >= 0; i--) {
            System.out.println("--8");
    switch (longString.charAt(i)) {
    case '\\':case '/':          System.out.println("--9");
            first=i;
          break out;
      }
    }
    System.out.println("--10");
    if ((len - (second - first)) < maxLength) break loop;
    out2: for (int i=second + 1; i < len; i++) {
      System.out.println("--11");
    switch (longString.charAt(i)) {
    case '\\':case '/':    System.out.println("--12");
      second=i;
    break out2;
    }
    }
    }
    System.out.println("--13");
    System.out.println(longString.substring(0,first + 1) + "..." + longString.substring(second));
    return longString.substring(0,first + 1) + "..." + longString.substring(second);
    }
    }
}
