package all;

public class ClonePair7502 {

    String method1(char _c){
      String r;
      if (_c == '<')   r="&lt;";
     else   if (_c == '>')   r="&gt;";
     else   if (_c == ' ')   r="&#32;";
     else   if (_c == '&')   r="&amp;";
     else   if (_c == '"')   r="&quot;";
     else   if (Character.isISOControl(_c) || (_c == '\'') || (_c == '\"')|| (_c > 254))   r="&#" + (int)_c + ";";
     else   r="" + _c;
      return r;
    }

    String method2(char _c){
      String r;
      if (_c == '<') {
        r="&lt;";
      }
     else   if (_c == '>') {
        r="&gt;";
      }
     else   if (_c == ' ') {
        r="&#32;";
      }
     else   if (_c == '&') {
        r="&amp;";
      }
     else   if (_c == '"') {
        r="&quot;";
      }
     else   if (Character.isISOControl(_c) || (_c == '\'') || (_c == '\"')|| (_c > 254)) {
        r="&#" + (int)_c + ";";
      }
     else {
        r="" + _c;
      }
      return r;
    }
}
