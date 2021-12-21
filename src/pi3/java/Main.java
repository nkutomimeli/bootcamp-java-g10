package pi3.java;

public class Main {
    public static void main(String[] args) {
        int iArr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8 };

        RadixSort rs = new RadixSort();
        rs.radixSort(iArr);
    }
}
