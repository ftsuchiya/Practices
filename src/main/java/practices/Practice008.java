package practices;

/**
 * 2以上の数値を入力し、素因数分解した結果を表示しなさい。
 * <p>
 * 引数：整数
 * 返却：素因数を半角スペースで区切った文字列
 * <p>
 * 　例）引数：20100
 * 　　　返却：2 2 3 5 5 67
 */

public class Practice008 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        System.out.println(factorization(20100));

    }

    // 素因数分解
    public static String factorization(int n) {
        if (n < 2) {
            throw new IllegalArgumentException("2より小さい数を入れたら、例外で帰ってくる");
        }

        String soinsu = "";

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {

                soinsu += " " + i;
                n = n / i;
                i--;
            }

            // soinsu += " " + n;
        }

        return soinsu.trim();
    }

}
