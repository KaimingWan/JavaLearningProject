import java.util.concurrent.*;

/**
 * Created by Kami Wan on 2016/3/4.
 */

class Task implements Callable<Integer> {        //Task用来计算1到100求和
    public Integer call() throws Exception {
        System.out.println("子线程在进行计算");
        Thread.sleep(3000);
        int sum = 0;
        for (int i = 0; i < 100; i++)
            sum += i;
        return sum;
    }
}

public class LearnFuture {
    public static void main(String[] args) {
//        //方法一:ExecutorService配合Future类来实现
//        ExecutorService executor = Executors.newCachedThreadPool();
//        Task task = new Task();
//        Future<Integer> result = executor.submit(task); //Futue需要配合ExecutorService当中的submit方法使用
//        executor.shutdown();

        //方法二：ExecutorService类配合FutureTask类来实现
        ExecutorService executor = Executors.newCachedThreadPool();
        Task task = new Task();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(task);
        executor.submit(futureTask);
        executor.shutdown();

        //方法三：Thread类配合FutureTask类来实现
//        Task task = new Task();
//        FutureTask<Integer> futureTask = new FutureTask<Integer>(task);
//        Thread thread = new Thread(futureTask); //Thread构造器可以直接接收一个
//        thread.start();


        // 这一段代码模拟主线程执行一些任务，不加也是可以的
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        System.out.println("主线程在执行任务");


        try {
//            System.out.println("task运行结果"+result.get()); //方法一
            System.out.println("task运行结果" + futureTask.get());//方法二或者方法三
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("所有任务执行完毕");

    }
}
