import java.util.ArrayList;
import java.util.List;

public class StackString {
    private List<String> inputs;

    public StackString() {
        inputs = new ArrayList<String>();
    }

    public int size() {
        return this.inputs.size();
    }

    public void push(String input) {
        this.inputs.add(input);
    }

    public void pop() {
        this.inputs.remove(size()-1);
    }
}
