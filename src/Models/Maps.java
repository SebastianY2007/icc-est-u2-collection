package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

    // MAPAS o DICCIONARIOS
    public Map<String, Integer> construirHashMap() {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 2);
        hashMap.put("B", 3);
        hashMap.put("A", 5);
        hashMap.put("C", 50);
        hashMap.put("D", 5);
        hashMap.put("F", 3);
        hashMap.put("G", 8);
        hashMap.put("H", 85);
        hashMap.put("I", 5);

        for (int i = 0; i < hashMap.size(); i++) {
            System.out.println(hashMap.values().toArray()[i ]);
        }
        for (String key : hashMap.keySet()) {
            System.out.println("Llave: " + key + " - Valor: " + hashMap.get(key));
        }

        return hashMap;
    }

    public Map<String, Integer> contruirLinkedHashMap() {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("A", 2);
        linkedHashMap.put("B", 3);
        linkedHashMap.put("A", 5);
        linkedHashMap.put("C", 50);
        linkedHashMap.put("D", 5);
        linkedHashMap.put("F", 3);
        linkedHashMap.put("G", 8);
        linkedHashMap.put("H", 85);
        linkedHashMap.put("I", 5);
        System.out.println(linkedHashMap.values());
        System.out.println(linkedHashMap.keySet());

        return linkedHashMap;
    }

    public Map<String, Integer> contruirTreeMap() {
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("B", 3);
        treeMap.put("C", 50);
        treeMap.put("A", 2);
        treeMap.put("I", 5);
        treeMap.put("F", 3);
        treeMap.put("D", 5);
        treeMap.put("G", 8);
        treeMap.put("H", 85);
        treeMap.put("A", 5);

        return treeMap;
    }

    public Map<Person, Integer> contruirTreeMapPersons() {
        Map<Person, Integer> treePersons = new TreeMap<>();
        treePersons.put(new Person("Carlos", 23), 1000);
        treePersons.put(new Person("Ana", 30), 2000);
        treePersons.put(new Person("Luis", 18), 3000);
        treePersons.put(new Person("Ana", 20), 4000);
        treePersons.put(new Person("Andres", 23), 5000);
        treePersons.put(new Person("Ana", 18), 6000);

        return treePersons; 
    }

    public Map<Integer, Person> contruirTreeMapPersonsObj() {
        List<Person> list = new ArrayList<>();
        
        list.add(new Person("Carlos", 23, 123));
        list.add(new Person("Ana", 30, 124));
        list.add(new Person("Luis", 18, 125));
        list.add(new Person("Ana", 20, 123));
        list.add(new Person("Andres", 23, 129));
        list.add(new Person("Ana", 18, 124));

        /// ORDENE POR LA EDAD Y NOMBRE 
        /// Y QUE NO PERMITA DUPLICADOS POR LA CEDULA
        /// Map<Cedula, Persona>
        
        Map<Integer, Person> persons = new TreeMap<>();

        // For al listado para ingresar a todas al mapa
        // persons.put(cedula_persona, Persona)

        for (Person p : list) {
            persons.put(p.getCedula(), p);
        }
        return persons; 
    }

    public void printFilter(Map<Person, Integer> treePersons) {
        // Imprimir todas las personas que el valor sea > 2000
        // y la edad de la persona sea >= 20

        for (Map.Entry<Person, Integer> entry : treePersons.entrySet()) {
            Person person = entry.getKey();
            Integer value = entry.getValue();

            if (value > 2000 && person.getAge() >= 20) {
                System.out.println(person + " -> " + value);
            }
        }
    }
}
