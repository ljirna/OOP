package Vjezba1911.GENERICS;

public class Pair<K, V> {
    private K key;
    private V value;
    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
    @Override
    public boolean equals(Object someKey){
        if(this.key == someKey){
            return true;
        }
        return false;
    }
}
class MainSto{

}