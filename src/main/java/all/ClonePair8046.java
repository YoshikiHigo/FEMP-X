package all;

public class ClonePair8046 {

    int method1(String[] supported,String expertise){
      if (supported == null)   return -1;
      if (expertise == null)   return -1;
      for (int i=0; i < supported.length; i++)   if (supported[i].equalsIgnoreCase(expertise))   return i;
      return -1;
    }

    int method2(String[] supported,String expertise){
      if (supported == null)   return -1;
      if (expertise == null)   return -1;
      for (int i=0; i < supported.length; i++)   if (supported[i].equals(expertise))   return i;
      return -1;
    }
}
