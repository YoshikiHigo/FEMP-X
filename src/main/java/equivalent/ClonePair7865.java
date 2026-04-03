package equivalent;

public class ClonePair7865 {
    boolean method1(String line, int position) {
        if (!line.contains("\"")) {
            return false;
        }
        int index;
        String left = line.substring(0, position);
        String right = line.substring(position);
        int leftCount = 0;
        int rightCount = 0;
        while ((index = left.indexOf("\"")) > -1) {
            leftCount++;
            left = left.substring(index + 1);
        }
        while ((index = right.indexOf("\"")) > -1) {
            rightCount++;
            right = right.substring(index + 1);
        }
        return rightCount % 2 != 0 && leftCount % 2 != 0;
    }

    boolean method2(String line, int position) {
        if (line.indexOf("\"") < 0) {
            return false;
        }
        int index;
        String left = line.substring(0, position);
        String right = line.substring(position);
        int leftCount = 0;
        int rightCount = 0;
        while ((index = left.indexOf("\"")) > -1) {
            leftCount++;
            left = left.substring(index + 1);
        }
        while ((index = right.indexOf("\"")) > -1) {
            rightCount++;
            right = right.substring(index + 1);
        }
        return rightCount % 2 != 0 && leftCount % 2 != 0;
    }
}
