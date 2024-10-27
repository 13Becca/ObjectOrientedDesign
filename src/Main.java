class Test{
//    write def const accessor mutator
    private int _x;
    public Test(){}
    public Test(int x){
        _x = x;
    }
    public int getX(){
        return _x;
    }
    public void setX(int x){
        _x = x;
    }
}

class TestTwo{
    //    write def const accessor mutator
    private int _y;
    public TestTwo(){}
    public TestTwo(int y){
        _y = y;
    }
    public int getY(){
        return _y;
    }
    public void setY(int y){
        _y = y;
    }
}
// when dec templated class, used <> after name of class the in between is usually T for
// templating but doesn't matter, now where is what gets passed in going to be used in
//class
class Stuff<T>{
    private T _thing;
    public Stuff() {
        _thing = null;
    }
    public Stuff(T t){
        _thing = t;
    }
    public T getThing(){
        return _thing;
    }
    public void setThing(T t){
        _thing = t;
    }
    public void print(){
        if (_thing != null)
            System.out.println("Type: " + _thing.getClass().getName() + ", value: "
                    + _thing);
        else
            System.out.println("null member variable");
    }


}

public class Main {
    public static void main(String[] args) {
        Test t = new Test(7);
        TestTwo t2 = new TestTwo(9);
//        instantiate a stuff object of Test
//        not instantiating a test object, this is instantiating a thing called
//        Stuff that can hold a Test object
        Stuff<Test> s = new Stuff<>();
        s.print();
//        add test object into s, not a containers so not an add method it only holds
//        one thing, so use setThing
        s.setThing(new Test(8));
        s.print();
//        want to be able to print the x value
        System.out.println(s.getThing().getX());
    }
}