public class StackString {
    private int size;
    private String input;

    public int size() {
        return this.size;
    }

    public void push(String input) {
        this.input = input;
        this.size++;
    }

    public String pop() {
        return this.input;
    }
}
