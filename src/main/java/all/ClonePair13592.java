package all;

public class ClonePair13592 {

    String method1(String a_source,String a_toReplace,String a_replaceWith){
      int position;
      while ((position=a_source.indexOf(a_toReplace)) != -1) {
        int position2=a_source.indexOf(a_replaceWith);
        if (a_replaceWith.indexOf(a_toReplace) != -1) {
          position2+=a_replaceWith.indexOf(a_toReplace);
        }
        if (position == position2) {
          break;
        }
        String before=a_source.substring(0,position);
        String after=a_source.substring(position + a_toReplace.length(),a_source.length());
        a_source=before + a_replaceWith + after;
      }
      return a_source;
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
