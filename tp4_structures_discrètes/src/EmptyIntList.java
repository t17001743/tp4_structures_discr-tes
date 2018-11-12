public class EmptyIntList implements IntList {

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public IntList cons(int n) {
        return null;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    String toString(){
        return ("Liste vide");
    }
}
