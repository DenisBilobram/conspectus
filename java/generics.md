```java
class Holder<T> {
    private T attr;
    Holder(T attr) {
        this.attr = attr;
    }
    public T get() {
        return this.attr;
    }
}
```
