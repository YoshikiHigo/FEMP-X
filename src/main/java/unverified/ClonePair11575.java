package unverified;

public class ClonePair11575 {

    String method1(String source,String target,String replacement){
      if (source == null) {
        return source;
      }
      String retvalue=source;
      int index=0;
      int previousIndex=0;
      if (source.indexOf(target) > -1) {
        StringBuffer hold=new StringBuffer();
        while (true) {
          index=source.indexOf(target,previousIndex);
          if (index < 0) {
            hold.append(source.substring(previousIndex));
            break;
          }
          hold.append(source.substring(previousIndex,index));
          hold.append(replacement);
          previousIndex=index + target.length();
        }
        retvalue=hold.toString();
      }
      return retvalue;
    }

    String method2(String str,String oldToken,String newToken){
      if (str == null)   return str;
      StringBuilder result=new StringBuilder(str.length() + 100);
      int i=str.indexOf(oldToken);
      int startOfIndex=0;
      for (; i != -1; i=str.indexOf(oldToken,startOfIndex)) {
        result.append(str.substring(startOfIndex,i));
        result.append(newToken);
        startOfIndex=i + oldToken.length();
      }
      result.append(str.substring(startOfIndex,str.length()));
      return result.toString();
    }
}
