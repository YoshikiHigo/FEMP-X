package all;

import java.util.*;

public class ClonePair9974 {

    String[] method1(String input,char delimiter){
      if (input != null && input.length() > 0) {
        StringBuffer part=new StringBuffer();
        boolean quote=false;
        Vector result=new Vector();
        for (int i=0; i < input.length(); i++) {
          char c=input.charAt(i);
          if (quote) {
            if (c == '\"') {
              quote=false;
            }
     else {
              part.append(c);
            }
          }
     else       if (c == '\"') {
            quote=true;
          }
     else       if (c == delimiter) {
            result.add(part.toString());
            part=new StringBuffer();
          }
     else {
            part.append(c);
          }
        }
        result.addElement(part.toString());
        String[] sda=new String[result.size()];
        result.copyInto(sda);
        return sda;
      }
      return new String[0];
    }

    String[] method2(String sourcex,char delimiter){
      if (sourcex == null)   return new String[0];
      if (sourcex.length() == 0)   return new String[0];
      final List strings=new ArrayList();
      String current=sourcex;
      while (true) {
        final int position=current.indexOf(delimiter);
        if (position < 0) {
          strings.add(current);
          break;
        }
     else     if (position == 0) {
          if (current.length() == 1) {
            strings.add(null);
            strings.add(null);
            break;
          }
     else {
            strings.add(null);
            current=current.substring(1);
            continue;
          }
        }
     else {
          strings.add(current.substring(0,position));
          if (current.length() - 1 == position) {
            strings.add(null);
            break;
          }
     else {
            current=current.substring(position + 1);
            continue;
          }
        }
      }
      return (String[])strings.toArray(new String[strings.size()]);
    }
}
