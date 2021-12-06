public class StackItem {

    private Integer value;
    private Integer minItemInStackWhenValueIsTop;

    public StackItem(Integer value, Integer minItemInStackWhenValueIsTop) {
        this.value = value;
        this.minItemInStackWhenValueIsTop = minItemInStackWhenValueIsTop;
    }

    public Integer getValue() {
        return value;
    }

    public Integer getMinItemInStackWhenValueIsTop() {
        return minItemInStackWhenValueIsTop;
    }
}
