/**
 * Created by glenc on Dec 2020
 **/
public class QueueRunner {

    public static void main(String[] args) {
        LinkedQueue linkedQueue = new LinkedQueue();

        linkedQueue.insert(12.90);
        linkedQueue.insert(32.40);
        linkedQueue.insert(42.80);
        linkedQueue.insert(52.760);
        linkedQueue.insert(882.90);


        linkedQueue.displayQueue();

        linkedQueue.insert(66.6);
        linkedQueue.insert(45.45);

        linkedQueue.displayQueue();

        linkedQueue.remove();
        linkedQueue.remove();

        linkedQueue.displayQueue();
    }
}
