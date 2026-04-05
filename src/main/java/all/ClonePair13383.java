package all;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ClonePair13383 {

    String[] method1(String property){
      final String delimiter=" ";
      Vector classes=new Vector();
      while (property.length() > 0) {
        int i=property.indexOf(delimiter);
        if (i > 0) {
          classes.addElement(property.substring(0,i));
          property=property.substring(property.indexOf(delimiter) + 1);
        }
     else {
          classes.addElement(property);
          property="";
        }
      }
      String[] result=new String[classes.size()];
      for (int i=0; i < classes.size(); i++) {
        result[i]=(String)classes.elementAt(i);
        System.out.println("result " + i + ": "+ result[i]);
      }
      return result;
    }

    String[] method2(String param){
      boolean inQuate=false;
      List commands=new ArrayList();
      StringBuffer buffer=new StringBuffer();
      for (int i=0; i < param.length(); i++) {
        char c=param.charAt(i);
        if (c == ' ' && !inQuate && buffer.length() > 0) {
          commands.add(buffer.toString());
          buffer.setLength(0);
          continue;
        }
        if (c == '\"') {
          inQuate=!inQuate;
          continue;
        }
        buffer.append(c);
      }
      if (buffer.length() > 0) {
        commands.add(buffer.toString());
      }
      return (String[])commands.toArray(new String[0]);
    }
}
