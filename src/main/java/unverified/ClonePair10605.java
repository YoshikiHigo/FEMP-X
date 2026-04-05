package unverified;

public class ClonePair10605 {

    int method1(String sb,int offset){
      int result;
      for (result=offset; result < sb.length(); result++) {
        if (!Character.isWhitespace(sb.charAt(result))) {
          break;
        }
      }
      return result;
    }

    int method2(String template,int i){
      while (i < template.length() && Character.isWhitespace(template.charAt(i))) {
        i++;
      }
      return i;
    }
}
