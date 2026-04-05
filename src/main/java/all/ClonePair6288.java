package all;

public class ClonePair6288 {

    boolean method1(String item,String part){
      int i0=part.indexOf('*');
      int i1=part.lastIndexOf('*');
      if ((i0 == -1) && (i1 == -1))   return item.equals(part);
     else   if (i0 == i1)   return item.startsWith(part.substring(0,i0)) && item.endsWith(part.substring(i0 + 1));
     else   if ((i0 == 0) && (i1 == (part.length() - 1)))   return item.contains(part.substring(i0 + 1,i1));
     else   return item.startsWith(part.substring(0,i0)) && item.endsWith(part.substring(i0 + 1)) && item.contains(part.substring(i0 + 1,i1));
    }

    boolean method2(String mime,String toMatch){
      if (mime.equalsIgnoreCase(toMatch))   return true;
      String[] parts=toMatch.split("/");
      return (parts.length == 2 && parts[1].equals("*") && mime.startsWith(parts[0] + "/"));
    }
}
