package unverified;

public class ClonePair12085 {

    String method1(String text,String replace,String with){
      if (text == null)   return null;
      int li=0;
      int l=replace.length();
      int i=text.indexOf(replace,li);
      if (i < 0)   return text;
      StringBuffer aWorkString=new StringBuffer(text.length() + 1);
      while (i >= 0) {
        if (i > li)     aWorkString.append(text.substring(li,i));
        aWorkString.append(with);
        li=i + l;
        i=text.indexOf(replace,li);
      }
      aWorkString.append(text.substring(li));
      return aWorkString.toString();
    }

    String method2(String source,String whatBefore,String whatAfter){
      if (null == source || source.length() == 0) {
        return source;
      }
      int beforeLen=whatBefore.length();
      if (beforeLen == 0) {
        return source;
      }
      StringBuffer result=new StringBuffer("");
      int lastIndex=0;
      int index=source.indexOf(whatBefore,lastIndex);
      while (index >= 0) {
        result.append(source.substring(lastIndex,index));
        result.append(whatAfter);
        lastIndex=index + beforeLen;
        index=source.indexOf(whatBefore,lastIndex);
      }
      result.append(source.substring(lastIndex));
      return result.toString();
    }
}
