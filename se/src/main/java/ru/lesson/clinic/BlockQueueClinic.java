package ru.lesson.clinic;
import java.util.LinkedList;

public class BlockQueueClinic<T> {

    public final LinkedList<T> queue = new LinkedList<T>();

    public void push(final T t){
        synchronized (this.queue){
            this.queue.add(t);
            this.queue.notifyAll();
        }
    }

    public T poil(){
        synchronized (this.queue){
            while (this.queue.isEmpty()){
                try {
                    this.queue.wait();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            //return this.queue.get(i);
            return this.queue.remove();
        }

    }
}
