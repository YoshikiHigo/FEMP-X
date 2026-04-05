package unverified;

public class ClonePair10790 {

    String method1(String in,String t1,String t2){
      StringBuffer result=new StringBuffer();
      int i=0;
      while (i < in.length()) {
        if (in.startsWith(t1,i)) {
          result.append(t2);
          if (t1.length() == 0) {
            result.append(in.charAt(i));
            i++;
          }
     else       i+=t1.length();
        }
     else {
          result.append(in.charAt(i));
          i++;
        }
      }
      return result.toString();
    }

    String method2(String textToChange,String fromText,String toText){
      if (textToChange.contains(fromText)) {
        StringBuilder sb=new StringBuilder(textToChange.length() - fromText.length() + toText.length());
        int start=textToChange.toLowerCase().indexOf(fromText.toLowerCase());
        while (start != -1) {
          sb.setLength(0);
          int end=start + fromText.length();
          sb.append(textToChange.substring(0,start));
          sb.append(toText);
          sb.append(textToChange.substring(end));
          textToChange=sb.toString();
          start=textToChange.indexOf(fromText);
        }
      }
      return textToChange;
    }
}
