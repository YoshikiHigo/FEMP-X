package all;

public class ClonePair9873 {

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

    String method2(String input,String oldString,String newString){
      String result=input;
      if (input != null && oldString != null && !"".equals(oldString)) {
        int newPosition=input.indexOf(oldString);
        if (newPosition != -1) {
          final StringBuilder builder=new StringBuilder();
          builder.append(input.substring(0,newPosition));
          builder.append(newString == null ? "" : newString);
          int oldPosition=newPosition + oldString.length();
          while ((newPosition=input.indexOf(oldString,oldPosition)) != -1) {
            builder.append(input.substring(oldPosition,newPosition));
            builder.append(newString == null ? "" : newString);
            oldPosition=newPosition + oldString.length();
          }
          builder.append(input.substring(oldPosition,input.length()));
          result=builder.toString();
        }
      }
      return result;
    }
}
