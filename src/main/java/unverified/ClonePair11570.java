package unverified;

public class ClonePair11570 {

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

    String method2(String value,String oldKeySubstring,String newKeySubstring){
      if (value == null) {
        return null;
      }
      int oldKeySubstringSize=oldKeySubstring.length();
      while (true) {
        int index=value.indexOf(oldKeySubstring);
        if (index == -1) {
          break;
        }
        value=value.substring(0,index) + newKeySubstring + value.substring(index + oldKeySubstringSize);
      }
      return value;
    }
}
