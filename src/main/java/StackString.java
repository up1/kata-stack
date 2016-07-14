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

    public String pop() {
        return this.inputs.remove(size()-1);
    }

    public String peek() {
        return this.inputs.get(size()-1);
    }
}
