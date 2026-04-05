package unverified;

public class ClonePair11362 {

    String method1(String source,String from,String to){
      StringBuffer result=new StringBuffer(source);
      int idx=source.indexOf(from);
      int lastPos=0;
      if (idx > -1)   result=new StringBuffer();
      while (idx > -1) {
        result.append(source.substring(lastPos,idx));
        result.append(to);
        lastPos=idx + from.length();
        idx=source.indexOf(from,lastPos);
        if (idx < 0)     result.append(source.substring(lastPos,source.length()));
      }
      return result.toString();
    }

    String method2(String original,String regex,String replacement){
      int index=0;
      String newString=original;
      while ((newString.contains(regex)) && (regex.compareTo(replacement) != 0)) {
        index=newString.indexOf(regex);
        newString=newString.substring(0,index) + replacement + newString.substring(index + regex.length(),newString.length());
      }
      return newString;
    }
}
