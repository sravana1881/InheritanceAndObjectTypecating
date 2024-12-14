package InheritanceExample;

public class Boy extends Person {
    static double ageFactor=1.2;
    public Boy() {
        super();
    }
    public String talk(){
       return (super.talk() + ".......I Love Java Class");
    }
    public String walk(){
        return (super.walk() + "  I am walking now");
    }
    public static double lifeSpan() {
       return(lifeSpan * ageFactor);
    }


}
