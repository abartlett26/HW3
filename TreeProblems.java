/*
 * *** ANNIKA BARTLETT / 002 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
    // copy the original sets
    Set<Integer> onlyA = new TreeSet<>(setA);
    Set<Integer> onlyB = new TreeSet<>(setB);

    // remove all elements from A that are in B
    onlyA.removeAll(setB);
    // remove all elements from B that are in A
    onlyB.removeAll(setA);

    // make new set
    Set<Integer> setC = new TreeSet<>();

    // add what's left of A and B
    setC.addAll(onlyA);
    setC.addAll(onlyB);

    return setC;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {
    // list of all bad keys
    List<Integer> evenKeys = new ArrayList<>();

    
    for (Integer key : treeMap.keySet()) {
      if (key % 2 == 0) {
        evenKeys.add(key);
      }
    }

    for (Integer key : evenKeys) {
      treeMap.remove(key);
    }
    return;
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

    // if equals, return true
    return tree1.equals(tree2);

  }

} // end treeProblems class
