 class Tabel extends SubjectElement {
    private String text;

    public Tabel(String Filename){
        this.text = Filename;
    }

    public void Print(){
        System.out.println("File"+text);
    }

    public void acceptVisitor(Visitor v){
        v.visitTabel(this);
    }
}
