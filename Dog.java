package Lesson6;

class Dog extends Animal {

    String name;
    public int run;
    public int sweem;

    //konstruktor

    public Dog(String name, int run, int sweem) {
        super();
        this.name = name;
        this.run = run;
        this.sweem = sweem;

    }
    public void Dogs() {
        System.out.println("DogName: " + name  + " Rasstoianie " + run+ " Metri/" + " /Plavanie:" + sweem);
    }
}
