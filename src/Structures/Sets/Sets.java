package Structures.Sets;

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
        
        
        return null;
    }

}
