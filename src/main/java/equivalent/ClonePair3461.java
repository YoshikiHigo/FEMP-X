package equivalent;

public class ClonePair3461 {
    byte[] method1(int[] NewOffsets, byte[] NewObjects) {
        char Count = (char) (NewOffsets.length - 1);
        int Size = NewOffsets[NewOffsets.length - 1];
        byte Offsize;
        if (Size <= 0xff) Offsize = 1;
        else if (Size <= 0xffff) Offsize = 2;
        else if (Size <= 0xffffff) Offsize = 3;
        else Offsize = 4;
        byte[] NewIndex = new byte[2 + 1 + Offsize * (Count + 1) + NewObjects.length];
        int Place = 0;
        NewIndex[Place++] = (byte) (Count >>> 8 & 0xff);
        NewIndex[Place++] = (byte) (Count >>> 0 & 0xff);
        NewIndex[Place++] = Offsize;
        for (int newOffset : NewOffsets) {
            int Num = newOffset - NewOffsets[0] + 1;
            switch (Offsize) {
                case 4:
                    NewIndex[Place++] = (byte) (Num >>> 24 & 0xff);
                case 3:
                    NewIndex[Place++] = (byte) (Num >>> 16 & 0xff);
                case 2:
                    NewIndex[Place++] = (byte) (Num >>> 8 & 0xff);
                case 1:
                    NewIndex[Place++] = (byte) (Num >>> 0 & 0xff);
            }
        }
        for (byte newObject : NewObjects) {
            NewIndex[Place++] = newObject;
        }
        return NewIndex;
    }

    byte[] method2(int[] NewOffsets, byte[] NewObjects) {
        char Count = (char) (NewOffsets.length - 1);
        int Size = NewOffsets[NewOffsets.length - 1];
        byte Offsize;
        if (Size <= 0xff) Offsize = 1;
        else if (Size <= 0xffff) Offsize = 2;
        else if (Size <= 0xffffff) Offsize = 3;
        else Offsize = 4;
        byte[] NewIndex = new byte[2 + 1 + Offsize * (Count + 1) + NewObjects.length];
        int Place = 0;
        NewIndex[Place++] = (byte) ((Count >>> 8) & 0xff);
        NewIndex[Place++] = (byte) ((Count >>> 0) & 0xff);
        NewIndex[Place++] = Offsize;
        for (int i = 0; i < NewOffsets.length; i++) {
            int Num = NewOffsets[i] - NewOffsets[0] + 1;
            switch (Offsize) {
                case 4:
                    NewIndex[Place++] = (byte) ((Num >>> 24) & 0xff);
                case 3:
                    NewIndex[Place++] = (byte) ((Num >>> 16) & 0xff);
                case 2:
                    NewIndex[Place++] = (byte) ((Num >>> 8) & 0xff);
                case 1:
                    NewIndex[Place++] = (byte) ((Num >>> 0) & 0xff);
            }
        }
        for (int i = 0; i < NewObjects.length; i++) {
            NewIndex[Place++] = NewObjects[i];
        }
        return NewIndex;
    }
}
