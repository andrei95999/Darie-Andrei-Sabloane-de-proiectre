
public abstract class AlignStrategy  {

    protected String text;

    public AlignStrategy(String txt){
        this.text = txt;
    }

    public abstract void printAlign(String text);
}
