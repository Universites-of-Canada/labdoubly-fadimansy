public class SinglyLinkedLIst<E> {
    private Node<E> head=null;
    private Node<E>tail=null;
    private int size=0;

    public SinglyLinkedLIst() {
    }

    public int getSize() {
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public E first(){
        if(isEmpty()){
            return null;
        }
        return head.getElement();
    }
    public E last(){
        if(isEmpty()){
            return null;
        }
        return tail.getElement();
    }
    public void addFirst(E e){
        head=new Node<E>(e,head);
        if(size==0) tail=head;
        size++;
    }
    public void addLast(E e){
        Node<E>newest=new Node<>(e,null);
        if(isEmpty())head=newest;
        else {
            tail.setNext(newest);
        }
        tail=newest;
        size++;
    }
    public E removeFirst(){
        if(isEmpty())return null;
        E answer= head.getElement();;
        head=head.getNext();
        size--;
        if(isEmpty()){
            tail=null;
        }
        return answer;
    }
    public void deleteNode(Node node) {

    }
        public SinglyLinkedLIst<Integer>oddEven(){

        SinglyLinkedLIst<Integer>odd=new SinglyLinkedLIst<>();


        return odd;
        }

    private static class Node<E>{
        private E element;
        private Node<E>next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

    }
}