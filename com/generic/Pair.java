package com.generic;

class Store<K, V>{
    private final K key;
    private final V value;

    public Store(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){return key;}
    public V getValue(){return value;}

    public void getBoth(){
        System.out.println(key +" at rupee " + value);
    }

}

public class Pair {
    public static void main(String[] args) {
        Store<String, Integer> pair1 = new Store<>("perfume",1200);
        System.out.println(pair1.getKey());
        System.out.println(pair1.getValue());
        pair1.getBoth();
    }
}
