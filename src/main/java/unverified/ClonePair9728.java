package unverified;

public class ClonePair9728 {

    boolean method1(char ch){
      if ((ch == ' ') || (ch == '\t') || (ch == '\r')|| (ch == '\n'))   return (true);
     else   return (false);
    }

    boolean method2(char c){
    switch (c) {
    case (' '):case ('\n'):case ('\t'):case ('\r'):    return true;
    default:  return false;
    }
    }
}
