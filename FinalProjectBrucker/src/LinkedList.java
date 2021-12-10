public class LinkedList {
	node head;
    node sorted;
    class node
    {
        int val;
        node next;
 
        public node(int val)
        {
            this.val = val;
        }
    }
    //Push method to push top element
    void push(int val)
    {
        node newnode = new node(val);
       //linking the old list into a new node
        newnode.next = head;
        //move the head to a new point in the new node
        head = newnode;
    }
    // function to sort a singly linked list using insertion sort
    void insertionSort(node headref)
    {
        // Initialize sorted linked list
        sorted = null;
        node current = headref;
        // Traverse the given linked list and insert every
        // node to sorted
        while (current != null)
        {
            // Store next for next iteration
            node next = current.next;
            // insert current in sorted linked list
            sortedInsert(current);
            //Updates the currnet head
            current = next;
        }
        // Update head_ref to point to sorted linked list
        head = sorted;
    }
    //method to insert a new node into the list
    void sortedInsert(node newnode)
    {
        if (sorted == null || sorted.val >= newnode.val)
        {
            newnode.next = sorted;
            sorted = newnode;
        }
        else
        {
            node current = sorted;
           //Locate to node before the point of insertion
            while (current.next != null && current.next.val < newnode.val)
            {
                current = current.next;
            }
            newnode.next = current.next;
            current.next = newnode;
        }
    }
    //function to print linked list
    void printlist(node head)
    {
        while (head != null)
        {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}