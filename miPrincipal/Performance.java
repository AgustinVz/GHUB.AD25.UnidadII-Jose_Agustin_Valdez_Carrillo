package miPrincipal;

public class Performance {
    private long ti, tf;
    private boolean stoped = false;
    public Performance(){
        start();
    }
    public void start(){
        ti = System.currentTimeMillis();
        stoped = false;
    }
    public void stop(){
        tf = System.currentTimeMillis();
        stoped = true;
    }
    public long getMillis(){
        //Retornar tiempo en milisegundos transcurrido 
        //entre las invocaciones de los metodos start y stop
        return tf-ti;
    }
    @Override
    public String toString(){
        if(!stoped){
            stop();
        }
        long diff = tf - ti;
        long min = diff/1000/60;
        long sec = (diff/1000)%60;
        return diff+" milisegundos ("+min+ " minutos," + sec +" segundos)";
    }
}
