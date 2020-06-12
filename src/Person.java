public class Person {
    private String name;

    public String getName(){
        return this.name;
    }

    public void serName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println(this.name + " says hi!");
    }
}
