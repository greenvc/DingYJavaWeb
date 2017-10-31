package Objects.InnerClass;

public abstract class Doctor implements Proficient {
    //多态，情况不定
    public void workInDay(){
        System.out.println("白天传授理论知识");
    }
    
}