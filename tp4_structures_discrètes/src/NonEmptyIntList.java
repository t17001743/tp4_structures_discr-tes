public class NonEmptyIntList implements IntList{


    boolean isEmpty(){
        return false;
    }

    /** @param n   l'entier à ajouter dans la liste
     * return      la liste à laquelle n est ajoutée
     */
    IntList cons(int n){

    }

    /** @return    la longueur de la liste
     */
    int length();

    /** @return    un String représentant la liste
     */
    String toString();
}
