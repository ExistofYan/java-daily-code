package MidTerm27710;

import java.util.IdentityHashMap;

abstract class Base {
    public Base() {
        show();    // ⚠️ 父类构造器里调用方法
    }

    public void show() {
        System.out.println("Base.show()");
    }

    abstract void p();
}

class Derived extends Base {
    private int value = 10;   // 显式初始化

    @Override
    public void show() {
        System.out.println("Derived.show(), value = " + value);
    }

    @Override
    void p() {
        System.out.println("implement");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o == this) return true;
        if (this.getClass() != o.getClass()) return false;
        Derived derived = (Derived) o;
        return this.value == derived.value;
    }

}

public class Bse {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.show();
    }
}
