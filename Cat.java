package Lesson6;

class Cat extends Animal {
    String name;
    protected boolean sweem;
    int run;

//konstruktor Cat

    public Cat(String name, int run, boolean sweem) {
        super();
        this.name = name;
        this.run = run;
        this.sweem = sweem;

    }


    public void Cats() {
        System.out.println("CatName: " + name + " Rasstoianie" + run + " Metri/" + " /Plavanie:" + sweem);
    }
}