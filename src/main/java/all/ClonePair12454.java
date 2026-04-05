package all;

public class ClonePair12454 {

    String method1(String toSearch,String find,String replace){
      if (find == null || toSearch == null || toSearch.indexOf(find) == -1)   return toSearch;
      if (replace == null)   replace="";
      int marker=0, findPos, findLen=find.length();
      StringBuilder sb=new StringBuilder();
      while ((findPos=toSearch.indexOf(find,marker)) > -1) {
        sb.append(toSearch.substring(marker,findPos));
        sb.append(replace);
        marker=findPos + findLen;
      }
      sb.append(toSearch.substring(marker));
      return sb.toString();
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
