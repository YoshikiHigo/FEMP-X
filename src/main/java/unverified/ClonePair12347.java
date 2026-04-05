package unverified;

public class ClonePair12347 {

    String method1(String s){
      if (s == null)   return s;
      int length=s.length();
      int newLength=length;
      boolean someCharacterEscaped=false;
      for (int i=0; i < length; i++) {
        char c=s.charAt(i);
        int cint=0xffff & c;
        if (cint < 32) {
    switch (c) {
    case '\r':case '\n':case '\t':case '\f':case ' ':default:{
              newLength-=1;
              someCharacterEscaped=true;
            }
        }
      }
     else {
    switch (c) {
    case '\"':{
            newLength+=5;
            someCharacterEscaped=true;
          }
        break;
    case '&':case '\'':{
        newLength+=4;
        someCharacterEscaped=true;
      }
    break;
    case '<':case '>':{
    newLength+=3;
    someCharacterEscaped=true;
    }
    break;
    }
    }
    }
    if (!someCharacterEscaped) {
    return s;
    }
    StringBuffer sb=new StringBuffer(newLength);
    for (int i=0; i < length; i++) {
    char c=s.charAt(i);
    int cint=0xffff & c;
    if (cint < 32) {
    switch (c) {
    case '\r':break;
    case '\n':{
    sb.append("<br>");
    }
    break;
    case '\t':{
    sb.append("&nbsp;&nbsp;");
    }
    break;
    case ' ':{
    sb.append("&nbsp;");
    }
    break;
    case '\f':break;
    default:{
    }
    }
    }
     else {
    switch (c) {
    case '\"':{
    sb.append("&quot;");
    }
    break;
    case '\'':{
    sb.append("&#39;");
    }
    break;
    case '&':{
    sb.append("&amp;");
    }
    break;
    case '<':{
    sb.append("&lt;");
    }
    break;
    case '>':{
    sb.append("&gt;");
    }
    break;
    default:{
    sb.append(c);
    }
    }
    }
    }
    return sb.toString();
    }

    String method2(String value){
      if (value == null || value.length() == 0) {
        return value;
      }
      StringBuffer result=null;
      String filtered=null;
      for (int i=0; i < value.length(); i++) {
        filtered=null;
    switch (value.charAt(i)) {
    case '<':      filtered="&lt;";
        break;
    case '>':  filtered="&gt;";
    break;
    case '&':filtered="&amp;";
    break;
    case '\"':filtered="&quot;";
    break;
    case '\'':filtered="&#39;";
    break;
    }
    if (result == null) {
    if (filtered != null) {
    result=new StringBuffer(value.length() + 50);
    if (i > 0) {
    result.append(value.substring(0,i));
    }
    result.append(filtered);
    }
    }
     else {
    if (filtered == null) {
    result.append(value.charAt(i));
    }
     else {
    result.append(filtered);
    }
    }
    }
    return result == null ? value : result.toString();
    }
}
