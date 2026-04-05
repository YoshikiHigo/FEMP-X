package all;

public class ClonePair12506 {

    String method1(String userAgent,int position){
      if (position < 0) {
        return "";
      }
      StringBuffer res=new StringBuffer();
      int status=0;
      while (position < userAgent.length()) {
        char c=userAgent.charAt(position);
    switch (status) {
    case 0:      if (c == ' ' || c == '/') {
            break;
          }
        if (c == ';' || c == ')') {
          return "";
        }
      status=1;
    case 1:if (";/)([".indexOf(c) > -1) {
      return res.toString().trim();
    }
    if (c == ' ') {
    status=2;
    }
    res.append(c);
    break;
    case 2:if (Character.isLetter(c) && Character.isLowerCase(c) || Character.isDigit(c)) {
    res.append(c);
    status=1;
    }
     else {
    return res.toString().trim();
    }
    break;
    default:break;
    }
    position++;
    }
    return res.toString().trim();
    }

    String method2(String a_userAgent,int a_position){
      if (a_position < 0)   return "";
      StringBuffer res=new StringBuffer();
      int status=0;
      while (a_position < a_userAgent.length()) {
        char c=a_userAgent.charAt(a_position);
    switch (status) {
    case 0:      if (c == ' ' || c == '/')       break;
        if (c == ';' || c == ')')     return "";
      status=1;
    case 1:if (c == ';' || c == '/' || c == ')' || c == '(' || c == '[') return res.toString().trim();
    if (c == ' ') status=2;
    res.append(c);
    break;
    case 2:if ((Character.isLetter(c) && Character.isLowerCase(c)) || Character.isDigit(c)) {
    res.append(c);
    status=1;
    }
     else return res.toString().trim();
    break;
    }
    a_position++;
    }
    return res.toString().trim();
    }
}
