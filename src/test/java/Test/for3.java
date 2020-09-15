package Test;

public class for3 {
    public static void main(String[] args) {
        for (int x = 1; x <= 9; x++) {        // 控制循环的行数
            for (int y = 1; y <= x; y++) {        // 控制列数
                System.out.print(x + "*" + y + "=" + (x * y) + "\t");
            }
            System.out.println();            // 换行
        }

    }
}
