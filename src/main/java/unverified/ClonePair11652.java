package unverified;

public class ClonePair11652 {

    String method1(String in,String what,String with){
      int pos=0, lp=0;
      StringBuffer sb=new StringBuffer();
      while ((pos=in.indexOf(what,lp)) > -1) {
        sb.append(in.substring(lp,pos));
        sb.append(with);
        lp=pos + what.length();
      }
      if (lp < in.length()) {
        sb.append(in.substring(lp));
      }
      return sb.toString();
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
