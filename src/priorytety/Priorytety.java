package priorytety;

public class Priorytety 
{
    public static void main(String[] args) 
    {
        System.out.println(Thread.currentThread().getPriority());
        
        Thread watek1 = new Thread(new Thread1(), "Maly");
        Thread watek2 = new Thread(new Thread2(), "Duzy");
        
        watek1.setPriority(Thread.MIN_PRIORITY);
        watek1.setPriority(Thread.MAX_PRIORITY);
        
        watek1.start();
        watek2.start();
        
        System.out.println(watek1.getPriority());
        System.out.println(watek2.getPriority());

    }
    
}

class Thread1 implements Runnable
{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    
}

class Thread2 implements Runnable
{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    
}