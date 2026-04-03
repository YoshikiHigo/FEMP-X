package equivalent;

public class ClonePair2222 {
    int method1(byte[] data) {
        int adder;
        int addee;
        int count;
        addee = (data[1] << 8);
        if ((int) data[0] < 0) {
            adder = (data[0]);
            adder += 256;
        } else {
            adder = data[0];
        }
        addee += adder;
        return addee;
    }

    int method2(byte[] bytes) {
        int adder, addee;
        addee = (bytes[1] << 8);
        if ((int) bytes[0] < 0) {
            adder = (bytes[0]);
            adder += 256;
        } else {
            adder = bytes[0];
        }
        addee += adder;
        return addee;
    }
}
