package all;

public class ClonePair4048 {

    StringBuffer method1(String tag,String content){
      StringBuffer sb=new StringBuffer();
      if (content == null || content.length() == 0)   return sb;
      if (tag != null && tag.length() > 0)   sb.append("<").append(tag).append(">");
      sb.append(content);
      if (tag != null && tag.length() > 0)   sb.append("</").append(tag).append(">");
      return sb;
    }

    StringBuffer method2(String tag,String content){
      StringBuffer sb=new StringBuffer();
      if ((content == null) || (content.length() == 0)) {
        return sb;
      }
      if ((tag != null) && (tag.length() > 0)) {
        sb.append("<").append(tag).append(">");
      }
      sb.append(content);
      if ((tag != null) && (tag.length() > 0)) {
        sb.append("</").append(tag).append(">");
      }
      return sb;
    }
}
