package all;

import java.util.ArrayList;
import java.util.List;

public class ClonePair13184 {

    String[] method1(String line){
      List<String> list=new ArrayList<String>();
      for (int i=0; i < line.length(); i++) {
        char c=line.charAt(i);
        if (Character.isWhitespace(c)) {
          int j=i + 1;
          for (; j < line.length() && Character.isWhitespace((char)line.charAt(j)); j++)       ;
          int start=j;
          for (; j < line.length() && !Character.isWhitespace((char)line.charAt(j)); j++)       ;
          int end=j;
          String word=line.substring(start,end);
          list.add(word);
          i=end + 1;
        }
     else     if ('\"' == c) {
          int idx=line.indexOf('\"',i + 1);
          if (idx >= 0) {
            list.add(line.substring(i + 1,idx));
            i=idx + 1;
          }
     else {
            list.add(line.substring(i + 1));
            i=line.length();
          }
        }
     else     if ('(' == c) {
          int idx=line.indexOf(") ",i + 1);
          if (idx >= 0) {
            list.add(line.substring(i + 1,idx));
            i=idx + 1;
          }
     else {
            String x=line.substring(i + 1);
            if (x.endsWith(")"))         x=x.substring(0,x.length() - 1);
            list.add(x);
            i=line.length();
          }
        }
     else {
          int j=i + 1;
          for (; j < line.length() && !Character.isWhitespace((char)line.charAt(j)); j++)       ;
          String word=line.substring(i,j);
          list.add(word);
          i=j;
        }
      }
      if (list.size() == 0)   return null;
      String[] array=new String[list.size()];
      array=list.toArray(array);
      return array;
    }

    String[] method2(String line){
      List list=new ArrayList();
      for (int i=0; i < line.length(); i++) {
        char c=line.charAt(i);
        if (Character.isWhitespace(c)) {
          int j=i + 1;
          for (; j < line.length() && Character.isWhitespace((char)line.charAt(j)); j++)       ;
          int start=j;
          for (; j < line.length() && !Character.isWhitespace((char)line.charAt(j)); j++)       ;
          int end=j;
          String word=line.substring(start,end);
          list.add(word);
          i=end + 1;
        }
     else     if ('\"' == c) {
          int idx=line.indexOf('\"',i + 1);
          if (idx >= 0) {
            list.add(line.substring(i + 1,idx));
            i=idx + 1;
          }
     else {
            list.add(line.substring(i + 1));
            i=line.length();
          }
        }
     else     if ('(' == c) {
          int idx=line.indexOf(')',i + 1);
          if (idx >= 0) {
            list.add(line.substring(i + 1,idx));
            i=idx + 1;
          }
     else {
            list.add(line.substring(i + 1));
            i=line.length();
          }
        }
     else {
          int j=i + 1;
          for (; j < line.length() && !Character.isWhitespace((char)line.charAt(j)); j++)       ;
          String word=line.substring(i,j);
          list.add(word);
          i=j;
        }
      }
      if (list.size() == 0)   return null;
      String[] array=new String[list.size()];
      array=(String[])list.toArray(array);
      return array;
    }
}
