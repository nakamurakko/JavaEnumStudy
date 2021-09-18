import enums.Statuses;

/**
 * Java の Enum の動きを確認。
 */
public class JavaEnumStudy {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Statuses.OK + ":" + Statuses.OK.getDescription());
        System.out.println(Statuses.NG + ":" + Statuses.NG.getDescription());

        System.out.println("----------");

        // for を使って Enum の値を全て出力。
        for (Statuses status : Statuses.values()) {
            System.out.println("status.name() : " + status.name() + ", status.ordinal() : " + status.ordinal()
                    + ", status.getCode() : " + status.getDescription());
        }
    }
}
