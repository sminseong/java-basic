package day12;

public class SingletonHolder {
    private SingletonHolder() {}

    private static class SingleInstanceHolder {
        private static final SingletonHolder INSTANCE = new SingletonHolder();
    }
    public static SingletonHolder getInstance() {
        return SingleInstanceHolder.INSTANCE;
    }
}
