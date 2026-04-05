package unverified;

public class ClonePair12512 {

    String method1(String searchIn,String beginString,String endString){
      int beginpos=searchIn.indexOf(beginString);
      int endpos=-1;
      if (beginpos != -1) {
        endpos=searchIn.substring(beginpos + beginString.length()).indexOf(endString);
        if (endpos != -1) {
          return searchIn.substring(beginpos + beginString.length(),beginpos + beginString.length() + endpos);
        }
      }
      return null;
    }

    String method2(String html,String startTag,String endTag){
      int s=html.indexOf(startTag);
      if (s == -1)   return null;
      s+=startTag.length();
      int e=html.indexOf(endTag,s);
      if (e == -1)   return null;
      return html.substring(s,e).trim();
    }
}
