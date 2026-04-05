package unverified;

public class ClonePair11604 {

    String method1(String input,String oldString,String newString){
      if (input == null || input.length() == 0 || input.indexOf(oldString,0) < 0) {
        return input;
      }
     else {
        int i=0;
        int j=0;
        int oldLength=oldString.length();
        StringBuffer buffer=new StringBuffer();
        while ((i=input.indexOf(oldString,i)) >= 0) {
          buffer.append(input.substring(j,i)).append(newString);
          j=(i+=oldLength);
        }
        input=buffer.append(input.substring(j)).toString();
        buffer=null;
        return input;
      }
    }

    String method2(String source,String search,String replace){
      if (search.equals(replace)) {
        return source;
      }
      StringBuffer result=new StringBuffer();
      int len=search.length();
      if (len == 0) {
        return source;
      }
      int pos=0;
      int nPos;
      do {
        nPos=source.indexOf(search,pos);
        if (nPos != -1) {
          result.append(source.substring(pos,nPos));
          result.append(replace);
          pos=nPos + len;
        }
     else {
          result.append(source.substring(pos));
        }
      }
     while (nPos != -1);
      return result.toString();
    }
}
