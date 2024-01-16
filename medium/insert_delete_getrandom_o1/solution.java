// ============================================================
//  Problem : Insert Delete GetRandom O(1)
//  Difficulty : Medium
//  Topics : Array, Hash Table, Math, Design, Randomized
//  Language : java
//  Submitted : 2024-01-16 21:23 UTC
//  Runtime : 26   Memory : 93584000
//  LeetCode URL : https://leetcode.com/problems/insert-delete-getrandom-o1/
// ============================================================
//
// Problem Description:
// Implement the RandomizedSet class:
// 
// 
// 	RandomizedSet() Initializes the RandomizedSet object.
// 	bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
// 	bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
// 	int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.
// 
// 
// You must implement the functions of the class such that each function works in average O(1) time complexity.
// 
//  
// Example 1:
// 
// 
// Input
// ["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]
// [[], [1], [2], [2], [], [1], [2], []]
// Output
// [null, true, false, true, 2, true, false, 2]
//
// ============================================================

class RandomizedSet {
    private Map<Integer, Integer> valueToIndexMap;
    private List<Integer> values;
    private Random rand;

    public RandomizedSet() { // --------------------------------/
        valueToIndexMap = new HashMap<>(); //O(1) average time  /
        values = new ArrayList<>(); //O(1) average time         / -- O(1)
        rand = new Random(); //O(1) average time                /
    } //--------------------------------------------------------/
    
    public boolean insert(int val) { //---------------------------/
        if (valueToIndexMap.containsKey(val)) { //O(1) Average    /
            return false;                                        //
        }                                                        // -- O(1) 
        valueToIndexMap.put(val, values.size()); //O(1) Average   /
        values.add(val); //O(1) Average                           /
        return true;                                             // 
    } //----------------------------------------------------------/
    
    public boolean remove(int val) { // ----------------------------/
        if (!valueToIndexMap.containsKey(val)) { //O(1) Average     /
            return false;                                          //
        }                                                          //
        int index = valueToIndexMap.get(val);  //O(1) Average       /                   
        int lastElement = values.get(values.size() - 1);//O(1) Avg  /
                                                                   //
        values.set(index, lastElement);   //O(1) Average            /
        // Move the last element to the 'deleted' position          /  --- O(1) 
        valueToIndexMap.put(lastElement, index); //O(1) Average     /
        // Update the index of the last element in the map          /
                                                                   //             
        values.remove(values.size() - 1); //O(1) Average            / 
        // Remove the last element                                  /
        valueToIndexMap.remove(val);  //O(1) Average                /
        // Remove the deleted element from map                      /   
        return true;                                               //
    } //------------------------------------------------------------/
    
    public int getRandom() { //---------------------------------------/
        int randomIndex = rand.nextInt(values.size()); //O(1) Average /
        return values.get(randomIndex);//O(1) Average                 / -- O(1)
    }   //------------------------------------------------------------/
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
