public class NonEmptyIntList implements IntList{

    int head;
    IntList queue;

    public NonEmptyIntList(int head, IntList queue){
        this.head = head;
        this.queue = queue;
    }

    public boolean isEmpty(){
        return false;
    }

    @Override
    public IntList cons(int n){
        return new NonEmptyIntList(n, this);
    }

    @Override
    public int length(){
        return queue.length() + 1;
    }

    @Override
    public String toString(){
        return("Liste non vide d'entiers");
    }
}
