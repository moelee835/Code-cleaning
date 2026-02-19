package practice.date_2026_02_19;

public class BadExamples {
    public static void main(String[] args) {
        System.out.println("=== Bad naming examples ===");
        System.out.println("d(2,3) = " + d(2, 3));
        m(true, 3);
        System.out.println("p(90) = " + p(90));
        run(new String[]{"10", "20", "30"});
    }

    // 1) 메소드와 변수 이름이 불명확하고 매직넘버 사용
    public static int d(int x, int y) {
        int t = x * y + 5; // 5는 이유 불명
        return t;
    }

    // 2) 불분명한 불리언 플래그와 이름
    public static void m(boolean b, int c) {
        if (b) {
            for (int i = 0; i < c; i++) {
                System.out.println("do");
            }
        } else {
            System.out.println("no");
        }
    }

    // 3) 매직 넘버(세율 등)를 직접 사용
    public static double p(double price) {
        return price * 1.05; // 1.05는 의미가 불명
    }

    // 4) 여러 책임이 뒤섞인 긴 메소드 (파싱/검증/계산/출력)
    public static void run(String[] arr) {
        int s = 0; // 합계
        for (int i = 0; i < arr.length; i++) {
            try {
                int n = Integer.parseInt(arr[i]);
                if (n > 0) {
                    s += n;
                }
            } catch (NumberFormatException e) {
                System.out.println("bad");
            }
        }
        System.out.println("sum = " + s);
    }
}

