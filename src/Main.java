public class Main {
    public static void main(String[] args) {
        BoundedWaitList<String> que = new BoundedWaitList<>(3);
        que.add("Sasha");
        que.add("Polya");
        que.add("Masha");
        que.add("Vanya");
        System.out.println(que);
        UnfairWaitList<String> unfque = new UnfairWaitList<>();
        unfque.content = que.content;
        System.out.println(unfque.content.peek()+" оотшел, теперь он последний");
        unfque.moveToBack(unfque.content.poll());
        System.out.println(unfque);
    }
}
