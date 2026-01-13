package Structures.Sets;

import Models.Person;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

     public Set<String> construirHashSet() {
        Set<String> hashSet = new HashSet<>();    
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");

        return hashSet;
    }

    public Set<String> construirLinkedHashSet() {

        Set<String> linkedHashSet = new LinkedHashSet<>();    
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("A");
        linkedHashSet.add("D");
        linkedHashSet.add("E");
        linkedHashSet.add("F");
        linkedHashSet.add("1Ggggggds");
        linkedHashSet.add("2Gggggggggsd");
        linkedHashSet.add("3Ggggfdsfd");
        linkedHashSet.add("4Ggggggggggdsfsdg");
        linkedHashSet.add("5Gggggggdfsd");
        linkedHashSet.add("6Ggggggggggdfsd");

        return linkedHashSet;
    }

    public Set<String> construirTreeSet() {
        Set<String> treSet = new TreeSet<>();
        treSet.add("D");
        treSet.add("A");
        treSet.add("E");
        treSet.add("I");
        treSet.add("O");
        treSet.add("B");
        treSet.add("a");
        
        return treSet;
    }

    public Set<String> construirTreeSetConComparador() {
        Set<String> treSetComp = new TreeSet<>((pal1, pal2) -> pal1.compareToIgnoreCase(pal2));

        treSetComp.add("D");
        treSetComp.add("A");
        treSetComp.add("A");
        treSetComp.add("E");
        treSetComp.add("I");
        treSetComp.add("O");
        treSetComp.add("B");
        treSetComp.add("a");
        
        return treSetComp;
    }

    public Set<Person> personsTreeSet() {
        Set<Person> treePersons = new TreeSet<>();
            /** 
            (p1, p2) -> {
            int comp = Integer.compare(p1.getAge(), p2.getAge());
            return comp;

            return p2.getName().compareTo(p1.getName());

            int compN = p1.getName().compareTo(p2.getName());
            if (compN != 0) return compN;

            int compA = Integer.compare(p2.getAge(), p1.getAge());
            
            return compA;
            */

        treePersons.add(new Person("Carlos", 23));
        treePersons.add(new Person("Ana", 30));
        treePersons.add(new Person("Luis", 18));
        treePersons.add(new Person("Ana", 20));
        treePersons.add(new Person("Andres", 23));
        treePersons.add(new Person("Luis", 18));

        return treePersons;
    }
}
