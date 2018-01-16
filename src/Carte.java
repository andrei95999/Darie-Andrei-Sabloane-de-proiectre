import java.util.ArrayList;


public class Carte {
    private String titlu;
    private ArrayList<Element> continut = new ArrayList<>();
    private ArrayList<String> autori = new ArrayList<>();

    public Carte(String titlu, ArrayList<String> autori) {
        this.titlu = titlu;
        this.autori = autori;
    }

    public void print(){
        for(String x : autori)
            System.out.println(x);
        for(Element e : continut)
            System.out.println(e);
    }

    public void AddAutori(String a){
        autori.add(a);
    }

    public void AddContinut(Element a){
        continut.add(a);
    }

    public void acceptVisitor(Visitor v){
        for(Element e : continut)
            e.acceptVisitor(v);
    }
}
