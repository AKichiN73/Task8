import java.util.concurrent.ConcurrentLinkedQueue;
public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList(){
        content = new ConcurrentLinkedQueue<E>();
    }

    public void remove(E element){
        content.remove(element);
    }

    public void moveToBack(E element){
        content.add(element);
    }
}
