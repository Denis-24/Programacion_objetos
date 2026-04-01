package Pruebas;

import java.util.*;

public class Tipos_Collecciones {
    public static void main(String[] args) {

        // ─────────────────────────────────────
        // ARRAYLIST
        // ─────────────────────────────────────
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Manzana");
        arrayList.add("Pera");
        arrayList.add("Manzana"); // permite duplicados
        System.out.println("ArrayList: " + arrayList);
        // → [Manzana, Pera, Manzana]


        // ─────────────────────────────────────
        // LINKEDLIST
        // ─────────────────────────────────────
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Primero");
        linkedList.add("Segundo");
        linkedList.addFirst("Antes de todo"); // añade al inicio
        System.out.println("LinkedList: " + linkedList);
        // → [Antes de todo, Primero, Segundo]


        // ─────────────────────────────────────
        // STACK
        // ─────────────────────────────────────
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack: " + stack);
        System.out.println("Stack pop: " + stack.pop()); // saca el 3
        // → Stack: [1, 2, 3]
        // → Stack pop: 3


        // ─────────────────────────────────────
        // HASHSET
        // ─────────────────────────────────────
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Rojo");
        hashSet.add("Verde");
        hashSet.add("Rojo"); // ignorado, ya existe
        System.out.println("HashSet: " + hashSet);
        // → [Verde, Rojo]  (orden aleatorio)


        // ─────────────────────────────────────
        // LINKEDHASHSET
        // ─────────────────────────────────────
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Rojo");
        linkedHashSet.add("Verde");
        linkedHashSet.add("Azul");
        linkedHashSet.add("Rojo"); // ignorado, ya existe
        System.out.println("LinkedHashSet: " + linkedHashSet);
        // → [Rojo, Verde, Azul]  (respeta orden de inserción)


        // ─────────────────────────────────────
        // TREESET
        // ─────────────────────────────────────
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(1); // ignorado, ya existe
        System.out.println("TreeSet: " + treeSet);
        // → [1, 3, 5]  (siempre ordenado)


        // ─────────────────────────────────────
        // QUEUE
        // ─────────────────────────────────────
        Queue<String> queue = new LinkedList<>();
        queue.add("Persona1");
        queue.add("Persona2");
        queue.add("Persona3");
        System.out.println("Queue poll: " + queue.poll()); // saca el primero
        System.out.println("Queue: " + queue);
        // → Queue poll: Persona1
        // → Queue: [Persona2, Persona3]


        // ─────────────────────────────────────
        // HASHMAP
        // ─────────────────────────────────────
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Juan", 25);
        hashMap.put("Ana", 30);
        hashMap.put("Juan", 99); // sobreescribe el 25
        System.out.println("HashMap: " + hashMap);
        System.out.println("HashMap get Juan: " + hashMap.get("Juan"));
        // → HashMap: {Ana=30, Juan=99}  (orden aleatorio)
        // → HashMap get Juan: 99


        // ─────────────────────────────────────
        // LINKEDHASHMAP
        // ─────────────────────────────────────
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Primero", 1);
        linkedHashMap.put("Segundo", 2);
        linkedHashMap.put("Tercero", 3);
        System.out.println("LinkedHashMap: " + linkedHashMap);
        // → {Primero=1, Segundo=2, Tercero=3}  (respeta orden de inserción)


        // ─────────────────────────────────────
        // TREEMAP
        // ─────────────────────────────────────
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Zebra", 1);
        treeMap.put("Abeja", 2);
        treeMap.put("Mango", 3);
        System.out.println("TreeMap: " + treeMap);
        // → {Abeja=2, Mango=3, Zebra=1}  (ordenado por clave alfabéticamente)

    }

//    Lo más importante a recordar de cada uno de un vistazo:
//            ```
//    ArrayList     → add(), get(índice), remove()
//    LinkedList    → add(), addFirst(), addLast(), removeFirst()
//    Stack         → push(), pop(), peek()
//    HashSet       → add(), contains(), remove()          sin orden
//    LinkedHashSet → add(), contains(), remove()          orden inserción
//    TreeSet       → add(), contains(), remove()          orden alfabético
//    Queue         → add(), poll(), peek()                FIFO
//    HashMap       → put(), get(clave), remove()          sin orden
//    LinkedHashMap → put(), get(clave), remove()          orden inserción
//    TreeMap       → put(), get(clave), remove()          orden alfabético
}

