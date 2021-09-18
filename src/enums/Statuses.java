package enums;

/**
 * ステータス一覧。
 */
public enum Statuses {
    OK("正常終了のステータス。"),
    NG("何らかのエラーがあった場合のステータス。");

    /** 説明。 */
    private String description;

    private Statuses(String description) {
        this.description = description;
    }

    /**
     * 説明を返す。
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }

}
