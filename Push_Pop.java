import java.util.Stack;
import java.util.concurrent.Semaphore;
public class Push_Pop {
public static void main(String[] args) {
Stack<Integer> stack = new Stack<>();
Semaphore semaphore = new Semaphore(0);
Thread pushThread = new Thread(() -> {
for (int i = 0; i < 10; i++) {
stack.push(i);
System.out.println("Pushed " + i);
semaphore.release();
}
});
Thread popThread = new Thread(() -> {
for (int i = 0; i < 10; i++) {
try {
semaphore.acquire();
Integer popped = stack.pop();
System.out.println("Popped " + popped);
} catch (InterruptedException e) {
e.printStackTrace();
}
}
});
pushThread.start();
popThread.start();
}
}
