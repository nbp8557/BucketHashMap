/**
 * Created by Brooker on 10/27/2015.
 */
public class Trace {

    public static void main(String [] args){
        ConcurrentBucketHashMap<String, Integer> hashMap = new ConcurrentBucketHashMap<>(3);

        Runnable run1 = new MyThread(hashMap);
        Runnable run2 = new MyThread(hashMap);

        new Thread(run1).start();
        new Thread(run2).start();

        System.out.println(hashMap.size());

    }

    private static class MyThread implements Runnable {
        private ConcurrentBucketHashMap<String, Integer> hashMap;

        public MyThread(ConcurrentBucketHashMap<String, Integer> hashMap ) {
            this.hashMap = hashMap;
        }

        public void run() {
            java.util.Random rand = new java.util.Random();
            float randomNum = 0;

            for(int counter=0; counter<5; counter++){
                randomNum = rand.nextFloat();
                this.hashMap.put("Test"+randomNum,counter);
                System.out.println("Added new Key: Test" + randomNum + " with a value of: " + counter);
            }
        }
    }

}

