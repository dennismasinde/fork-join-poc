import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {

        CustomRecursiveAction customRecursiveTask = new CustomRecursiveAction("some text");

        ForkJoinPool commonPool = ForkJoinPool.commonPool();

        commonPool.execute(customRecursiveTask);
        System.out.println(customRecursiveTask.join());
    }
}