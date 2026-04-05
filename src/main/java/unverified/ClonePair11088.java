package unverified;

public class ClonePair11088 {

    String method1(String str,String oldVal,String newVal){
      String res=str;
      if (str.length() > 0) {
        int pos=str.indexOf(oldVal);
        if (pos >= 0) {
          res=str.substring(0,pos);
          res=res.concat(newVal);
          res=res.concat(str.substring(pos + oldVal.length()));
          return res;
        }
      }
      return res;
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
