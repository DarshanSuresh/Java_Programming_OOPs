import java.util.*;

/**
 * Comprehensive demonstration of Java Collections Framework
 */
public class CollectionsDemo {
    
    // Demonstrate List interface implementations
    public static void demonstrateList() {
        System.out.println("=== List Interface Demo ===");
        
        // ArrayList - dynamic array, good for random access
        System.out.println("1. ArrayList:");
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Apple"); // Duplicates allowed
        arrayList.add(1, "Blueberry"); // Insert at index
        
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Element at index 2: " + arrayList.get(2));
        System.out.println("Size: " + arrayList.size());
        
        // LinkedList - doubly-linked list, good for insertions/deletions
        System.out.println("\n2. LinkedList:");
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        ((LinkedList<Integer>) linkedList).addFirst(5); // LinkedList specific method
        ((LinkedList<Integer>) linkedList).addLast(40);
        
        System.out.println("LinkedList: " + linkedList);
        
        // Vector - synchronized version of ArrayList
        System.out.println("\n3. Vector:");
        Vector<String> vector = new Vector<>();
        vector.add("Vector");
        vector.add("Is");
        vector.add("Synchronized");
        System.out.println("Vector: " + vector);
        System.out.println();
    }
    
    // Demonstrate Set interface implementations
    public static void demonstrateSet() {
        System.out.println("=== Set Interface Demo ===");
        
        // HashSet - no duplicates, no order
        System.out.println("1. HashSet:");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("C++");
        hashSet.add("Java"); // Duplicate - won't be added
        System.out.println("HashSet: " + hashSet);
        
        // LinkedHashSet - no duplicates, maintains insertion order
        System.out.println("\n2. LinkedHashSet:");
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("First");
        linkedHashSet.add("Second");
        linkedHashSet.add("Third");
        linkedHashSet.add("First"); // Duplicate - won't be added
        System.out.println("LinkedHashSet: " + linkedHashSet);
        
        // TreeSet - no duplicates, sorted order
        System.out.println("\n3. TreeSet:");
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(40);
        treeSet.add(10); // Duplicate - won't be added
        System.out.println("TreeSet (sorted): " + treeSet);
        System.out.println();
    }
    
    // Demonstrate Map interface implementations
    public static void demonstrateMap() {
        System.out.println("=== Map Interface Demo ===");
        
        // HashMap - key-value pairs, no order
        System.out.println("1. HashMap:");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 100);
        hashMap.put("Banana", 75);
        hashMap.put("Cherry", 150);
        hashMap.put("Apple", 120); // Updates existing value
        
        System.out.println("HashMap: " + hashMap);
        System.out.println("Value for 'Banana': " + hashMap.get("Banana"));
        System.out.println("Contains key 'Cherry': " + hashMap.containsKey("Cherry"));
        
        // LinkedHashMap - maintains insertion order
        System.out.println("\n2. LinkedHashMap:");
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Name", "John Doe");
        linkedHashMap.put("Age", "25");
        linkedHashMap.put("City", "New York");
        linkedHashMap.put("Country", "USA");
        System.out.println("LinkedHashMap: " + linkedHashMap);
        
        // TreeMap - sorted by keys
        System.out.println("\n3. TreeMap:");
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(4, "Four");
        treeMap.put(2, "Two");
        System.out.println("TreeMap (sorted by keys): " + treeMap);
        
        // Hashtable - synchronized version of HashMap
        System.out.println("\n4. Hashtable:");
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Monday", 1);
        hashtable.put("Tuesday", 2);
        hashtable.put("Wednesday", 3);
        System.out.println("Hashtable: " + hashtable);
        System.out.println();
    }
    
    // Demonstrate Queue interface implementations
    public static void demonstrateQueue() {
        System.out.println("=== Queue Interface Demo ===");
        
        // LinkedList as Queue (FIFO)
        System.out.println("1. Queue using LinkedList:");
        Queue<String> queue = new LinkedList<>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        System.out.println("Queue: " + queue);
        System.out.println("Poll (remove and return): " + queue.poll());
        System.out.println("Peek (without removing): " + queue.peek());
        System.out.println("Queue after poll: " + queue);
        
        // PriorityQueue - elements ordered by priority
        System.out.println("\n2. PriorityQueue:");
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(30);
        priorityQueue.offer(10);
        priorityQueue.offer(20);
        priorityQueue.offer(40);
        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println("Elements in priority order:");
        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.poll() + " ");
        }
        System.out.println();
        
        // ArrayDeque as Deque (double-ended queue)
        System.out.println("\n3. ArrayDeque:");
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Middle");
        deque.addFirst("First");
        deque.addLast("Last");
        System.out.println("Deque: " + deque);
        System.out.println("Remove first: " + deque.removeFirst());
        System.out.println("Remove last: " + deque.removeLast());
        System.out.println("Deque after removals: " + deque);
        System.out.println();
    }
    
    // Demonstrate iterating through collections
    public static void demonstrateIteration() {
        System.out.println("=== Collection Iteration Demo ===");
        
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Date");
        
        // Enhanced for loop (for-each)
        System.out.println("1. Enhanced for loop:");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        
        // Iterator
        System.out.println("\n2. Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        
        // ListIterator (bidirectional)
        System.out.println("\n3. ListIterator (backwards):");
        ListIterator<String> listIterator = fruits.listIterator(fruits.size());
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();
        
        // Streams (Java 8+)
        System.out.println("\n4. Streams:");
        fruits.stream()
              .filter(fruit -> fruit.length() > 5)
              .map(String::toUpperCase)
              .forEach(fruit -> System.out.print(fruit + " "));
        System.out.println("\n");
    }
    
    // Demonstrate Collections utility class
    public static void demonstrateCollectionsUtility() {
        System.out.println("=== Collections Utility Class Demo ===");
        
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9, 3));
        System.out.println("Original list: " + numbers);
        
        // Sorting
        Collections.sort(numbers);
        System.out.println("After sorting: " + numbers);
        
        // Reverse
        Collections.reverse(numbers);
        System.out.println("After reverse: " + numbers);
        
        // Shuffle
        Collections.shuffle(numbers);
        System.out.println("After shuffle: " + numbers);
        
        // Binary search (list must be sorted first)
        Collections.sort(numbers);
        int index = Collections.binarySearch(numbers, 5);
        System.out.println("Binary search for 5: index " + index);
        
        // Min and Max
        System.out.println("Min element: " + Collections.min(numbers));
        System.out.println("Max element: " + Collections.max(numbers));
        
        // Frequency
        numbers.addAll(Arrays.asList(2, 2, 3));
        System.out.println("List with duplicates: " + numbers);
        System.out.println("Frequency of 2: " + Collections.frequency(numbers, 2));
        
        // Create unmodifiable collection
        List<Integer> unmodifiableList = Collections.unmodifiableList(numbers);
        System.out.println("Unmodifiable list created");
        // unmodifiableList.add(10); // This would throw UnsupportedOperationException
        
        System.out.println();
    }
    
    // Demonstrate custom objects in collections
    public static void demonstrateCustomObjects() {
        System.out.println("=== Custom Objects in Collections Demo ===");
        
        // Create a list of custom objects
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 22));
        people.add(new Person("Diana", 28));
        
        System.out.println("Original list:");
        people.forEach(System.out::println);
        
        // Sort by age using Comparator
        Collections.sort(people, Comparator.comparingInt(Person::getAge));
        System.out.println("\nSorted by age:");
        people.forEach(System.out::println);
        
        // Sort by name
        Collections.sort(people, Comparator.comparing(Person::getName));
        System.out.println("\nSorted by name:");
        people.forEach(System.out::println);
        
        // Using TreeSet with custom comparator
        Set<Person> personSet = new TreeSet<>(Comparator.comparing(Person::getName));
        personSet.addAll(people);
        System.out.println("\nTreeSet (sorted by name):");
        personSet.forEach(System.out::println);
        
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("=== Java Collections Framework Comprehensive Demo ===\n");
        
        demonstrateList();
        demonstrateSet();
        demonstrateMap();
        demonstrateQueue();
        demonstrateIteration();
        demonstrateCollectionsUtility();
        demonstrateCustomObjects();
        
        System.out.println("=== Collections Framework Concepts Covered ===");
        System.out.println("✓ List interface: ArrayList, LinkedList, Vector");
        System.out.println("✓ Set interface: HashSet, LinkedHashSet, TreeSet");
        System.out.println("✓ Map interface: HashMap, LinkedHashMap, TreeMap, Hashtable");
        System.out.println("✓ Queue interface: LinkedList, PriorityQueue, ArrayDeque");
        System.out.println("✓ Collection iteration: for-each, Iterator, ListIterator, Streams");
        System.out.println("✓ Collections utility class methods");
        System.out.println("✓ Custom objects in collections with Comparators");
        System.out.println("✓ Thread-safe collections and performance considerations");
    }
}

// Custom class for demonstration
class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() { return name; }
    public int getAge() { return age; }
    
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}