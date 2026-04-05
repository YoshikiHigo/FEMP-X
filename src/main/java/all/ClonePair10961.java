package all;

public class ClonePair10961 {

    boolean method1(char c){
      if ((c < 32) || (c == '&') || (c == '<')|| (c == '>')|| (c == '"')|| (c == '\'')|| (c == '\n')|| (c == '\r')) {
        return true;
      }
      return false;
    }

    boolean method2(char c){
      if (c >= '0' && c <= '9')   return false;
      if (c >= 'A' && c <= 'Z')   return false;
      if (c >= 'a' && c <= 'z')   return false;
      if (c == ' ')   return false;
      if (c == ',')   return false;
      if (c == '.')   return false;
      if (c == '/')   return false;
      if (c == '!')   return false;
      if (c == '$')   return false;
      if (c == '^')   return false;
      if (c == '*')   return false;
      if (c == '(')   return false;
      if (c == ')')   return false;
      if (c == '_')   return false;
      if (c == '-')   return false;
      if (c == '{')   return false;
      if (c == '}')   return false;
      if (c == '[')   return false;
      if (c == ']')   return false;
      if (c == '|')   return false;
      if (c == '\\')   return false;
      return true;
    }
}
