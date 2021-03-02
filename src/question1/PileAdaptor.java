package question1;

public class PileAdaptor implements PileI {
    public StackImpl stack;

    PileAdaptor(StackImpl stack) {
        this.stack = stack;
    }
    @Override
    public void empiler(Object o) {
        this.stack.push(o);
    }

    @Override
    public Object depiler() {
        return this.stack.pop();
    }

    @Override
    public boolean estVide() {
        return this.stack.isEmpty();
    }
}
