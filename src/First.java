public class First implements Zero {
    private Second x;
    
    public void method(Third y) {
        x = y.doSomething();
    }
}