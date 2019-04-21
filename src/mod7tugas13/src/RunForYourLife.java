public class RunForYourLife implements Runnable{
    private String name;
    private Thread thread;
    private int interval;

    RunForYourLife(String name, int interval){
        this.name = name;
        this.interval = interval;
        System.out.println(name + ", ready");
    }

    public void run(){
        System.out.println(name + ", go!");
        try{
            for(int checkP = 1; checkP <= 20; checkP++){
                System.out.println(name + " has passed checkpoint(" + checkP + ")");
                Thread.sleep(interval);
            }
        }
        catch(InterruptedException e){
            System.out.println(name + " was interrupted.");

        }
        System.out.println("\n" + name + " has finished. \n");
    }

    public void start(){
        System.out.println(name + ", set ...");
        if(thread == null){
            thread = new Thread (this, name);
            thread.start();
        }
    }
}
