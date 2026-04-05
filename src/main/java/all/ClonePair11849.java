package all;

public class ClonePair11849 {

    boolean method1(char c){
      if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))   return (true);
      String s="%;/?:@&=+$,-_.!~*'()";
      for (int i=0; i < s.length(); i++)   if (s.charAt(i) == c)   return (true);
      return (false);
    }

    boolean method2(char c){
      if (c >= 'a' && c <= 'z')   return true;
      if (c >= 'A' && c <= 'Z')   return true;
      if (c >= '0' && c <= '9')   return true;
      if (c == '/')   return true;
      if (c == '-')   return true;
      if (c == '.')   return true;
      if (c == '?')   return true;
      if (c == ':')   return true;
      if (c == '@')   return true;
      if (c == '&')   return true;
      if (c == '=')   return true;
      if (c == '+')   return true;
      if (c == '$')   return true;
      if (c == ',')   return true;
      if (c == '%')   return true;
      if (c == '_')   return true;
      if (c == '!')   return true;
      if (c == '~')   return true;
      if (c == '*')   return true;
      if (c == '\'')   return true;
      if (c == '(')   return true;
      if (c == ')')   return true;
      return false;
    }
}
