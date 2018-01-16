
public interface Element {

    public void Add(Element x);
    public void Remove(Element x);
    public Element getElement(int index);
    public void Print();
    public void acceptVisitor(Visitor v);

}
