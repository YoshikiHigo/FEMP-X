package all;

public class ClonePair10739 {

    String method1(String input,String oldParameter,String newParameter){
      if (input == null || "".equals(input)) {
        return "";
      }
      boolean shouldKeep=newParameter != null && !newParameter.equals("");
      String[] allParameters=input.split(",");
      StringBuffer answer=new StringBuffer();
      for (int i=0; i < allParameters.length; i++) {
        String currentParameter=allParameters[i].trim();
        String nextParameter=null;
        if (!oldParameter.equals(currentParameter)) {
          nextParameter=currentParameter;
        }
     else     if (shouldKeep) {
          nextParameter=newParameter;
        }
        if (nextParameter == null) {
          continue;
        }
        if (answer.length() > 0) {
          answer.append(", ");
        }
        answer.append(nextParameter);
      }
      return answer.toString();
    }

    String method2(String str,String charFind,String strPaste){
      StringBuffer sb=new StringBuffer("");
      if (str != null) {
        if (!charFind.equals(strPaste)) {
          int last=str.indexOf(charFind);
          while (last != -1) {
            sb.append(str.substring(0,last));
            sb.append(strPaste);
            str=str.substring(last + charFind.length(),str.length());
            last=str.indexOf(charFind);
          }
        }
        sb.append(str);
      }
      return sb.toString();
    }
}
