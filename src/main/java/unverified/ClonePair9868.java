package unverified;

public class ClonePair9868 {

    String method1(String input,String search,String replace){
      if (input == null || search == null) {
        return input;
      }
      if (replace == null) {
        replace="";
      }
      int index=input.indexOf(search);
      if (index == -1) {
        return input;
      }
      StringBuffer out=new StringBuffer();
      int afterPrev=0;
      while (index != -1) {
        out.append(input.substring(afterPrev,index));
        out.append(replace);
        afterPrev=index + search.length();
        index=input.indexOf(search,afterPrev);
      }
      out.append(input.substring(afterPrev));
      return out.toString();
    }

    String method2(String value,String oldPart,String newPart){
      if ((value == null) || (value.length() == 0) || (oldPart == null)|| (oldPart.length() == 0)) {
        return value;
      }
      int oldPartLength=oldPart.length();
      String oldValue=value;
      StringBuffer retValue=new StringBuffer();
      int pos=oldValue.indexOf(oldPart);
      while (pos != -1) {
        retValue.append(oldValue.substring(0,pos));
        if ((newPart != null) && (newPart.length() > 0)) {
          retValue.append(newPart);
        }
        oldValue=oldValue.substring(pos + oldPartLength);
        pos=oldValue.indexOf(oldPart);
      }
      retValue.append(oldValue);
      return retValue.toString();
    }
}
