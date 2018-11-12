public class EmptyIntList implements IntList {

    boolean isEmpty(){
        return true;
    }

    IntList cons(int n){
        return n;
    }

    int length(){
        return 0;
    }

    String toString(){
        return ("Vide");
    }
}
