package all;

public class ClonePair5130 {

    String method1(char cb[],int length){
      StringBuffer out=new StringBuffer(length * 4);
      for (int i=0; i < length; i++) {
        Character ch=new Character((cb[i]));
        String test=ch.toString();
        char c=test.charAt(0);
    switch (c) {
    case '"':case '<':case '>':case '&':      out.append("&#" + (int)c + ";");
        break;
    case 129:  out.append("&uuml;");
    break;
    case 130:out.append("&eacute;");
    break;
    case 132:out.append("&auml;");
    break;
    case 134:out.append("&aring;");
    break;
    case 142:out.append("&Auml;");
    break;
    case 143:out.append("&Aring;");
    break;
    case 144:out.append("&Eacute;");
    break;
    case 145:out.append("&aelig;");
    break;
    case 146:out.append("&AElig;");
    break;
    case 148:out.append("&ouml;");
    break;
    case 153:out.append("&Ouml;");
    break;
    case 154:out.append("&Uuml;");
    break;
    default:if ((int)c > 127) {
    out.append("&#" + c + ";");
    }
     else {
    out.append(c);
    }
    }
    }
    return out.toString();
    }

    String method2(char cb[],int length){
      StringBuffer out=new StringBuffer(length * 4);
      for (int i=0; i < length; i++) {
        Character ch=new Character((cb[i]));
        String test=ch.toString();
        char c=test.charAt(0);
    switch (c) {
    case '"':case '<':case '>':case '&':      out.append("&#" + (int)c + ";");
        break;
    default:  if ((int)c > 127) {
        int show=c;
        out.append("&#" + show + ";");
      }
     else {
        out.append(c);
      }
    }
    }
    return out.toString();
    }
}
