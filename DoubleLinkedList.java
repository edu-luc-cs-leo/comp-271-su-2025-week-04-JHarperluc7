public class DoubleLinkedList implements Comparable<DoubleLinkedList> {

    private static final String DEFAULT_NAME = "Whatever";

    private String name;
    private Node head;
    private Node tail;
    private int size; // To track number of nodes

    /** Basic constructor */
    public DoubleLinkedList(String name) {
        this.name = name;
        this.head = null;
        this.tail = null;
        this.size = 0; // start
    } // Basic constructor

    /** Default constructor passes default name to basic constructor */
    public DoubleLinkedList() {
        this(DEFAULT_NAME);
    } // default constructor

    // Always* write a toString method for your objects.
    // --------
    // * well, almost always ...
    public String toString() {
        return this.name;
    } // method toString

    /** Add a new node to the linked list */
    public void add(Node node) {
        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.setNext(node); // link forward
            node.setPrevious(this.tail); // link backward
        }
        this.tail = node;
        this.size++; //gives size
    } // method add

    // overload method add to add a node by value
    public void add(String value) {
        Node node = new Node(value); //create node
        this.add(node);               //reuse add(Node)
    } // method add

     @Override
     public int compareTo(DoubleLinkedList other) {        
        if (this.size != other.size) {                    // Compare by size first
            return this.size - other.size;
         }
         return this.name.compareTo(other.name);           // Tiebreaker based on name lex order
     }
} // class DoubleLinkedList
