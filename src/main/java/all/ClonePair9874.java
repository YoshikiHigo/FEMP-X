package all;

public class ClonePair9874 {

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

    String method2(String text,String replace,String replaceTo){
      if (text == null || replace == null || replaceTo == null || replace.length() == 0) {
        return text;
      }
      StringBuffer buf=new StringBuffer(text.length());
      int searchFrom=0;
      while (true) {
        int foundAt=text.indexOf(replace,searchFrom);
        if (foundAt == -1) {
          break;
        }
        buf.append(text.substring(searchFrom,foundAt)).append(replaceTo);
        searchFrom=foundAt + replace.length();
      }
      buf.append(text.substring(searchFrom));
      return buf.toString();
    }
}
