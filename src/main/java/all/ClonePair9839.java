package all;

public class ClonePair9839 {

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

    String method2(String mainString,String oldString,String newString){
      if (mainString == null) {
        return null;
      }
      if (oldString == null || oldString.length() == 0) {
        return mainString;
      }
      if (newString == null) {
        newString="";
      }
      int i=mainString.lastIndexOf(oldString);
      if (i < 0)   return mainString;
      StringBuffer mainSb=new StringBuffer(mainString);
      while (i >= 0) {
        mainSb.replace(i,i + oldString.length(),newString);
        i=mainString.lastIndexOf(oldString,i - 1);
      }
      return mainSb.toString();
    }
}
