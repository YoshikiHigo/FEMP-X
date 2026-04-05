package all;

public class ClonePair11992 {

    String method1(int i){
      if (i == '&')   return "&amp;";
     else   if (i == '<')   return "&lt;";
     else   if (i == '>')   return "&gt;";
     else   if (i == '"')   return "&quot;";
     else   return "" + (char)i;
    }

    String method2(int i){
      if (i == 38)   return "&amp;";
      if (i == 60)   return "&lt;";
      if (i == 62)   return "&gt;";
      if (i == 34)   return "&quot;";
     else   return (new StringBuilder()).append("").append((char)i).toString();
    }
}
