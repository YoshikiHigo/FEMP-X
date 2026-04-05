package all;

import java.util.StringTokenizer;

public class ClonePair12590 {

    String method1(String in,int width){
      String out="";
      StringTokenizer lineTokenizer=new StringTokenizer(in,"\n",true);
      while (lineTokenizer.hasMoreTokens()) {
        String line=lineTokenizer.nextToken();
        if (line.length() > width + 1) {
          StringTokenizer wordTokenizer=new StringTokenizer(line,"\t ",true);
          String newLine="";
          while (wordTokenizer.hasMoreTokens()) {
            String word=wordTokenizer.nextToken();
            if (newLine.length() + word.length() > width) {
              out+=newLine + "\n";
              if (!word.equalsIgnoreCase(" ")) {
                newLine=word;
              }
     else {
                newLine="";
              }
            }
     else {
              newLine+=word;
            }
          }
          out+=newLine;
        }
     else {
          out+=line;
        }
      }
      return (out.trim());
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
