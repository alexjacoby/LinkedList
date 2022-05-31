/**
 * Home-grown LinkedList implementation.
 *
 * @author AP CS A (May 31, 2022)
 */
public class LinkedListFun<T> {
   private static class Node<T> {
      private T value;
      private Node<T> next;

      public Node(T value) {
         this.value = value;
      }

      public void setNext(Node<T> next) {
         this.next = next;
      }

      public Node<T> next() { return next; }

      public T value() { return value; }

      public String toString() {
         return "" + value;
         // Protects against null values by not calling toString()
         // directly!
      }
   }

   private Node<T> head;

   public LinkedListFun() {
      // Does nothing!
   }

   public void add(T value) {
      if (head == null) {
         head = new Node<T>(value);
      } else {
         tail().setNext(new Node<T>(value));
      }
   }

   /**
    * Returns last node if possible.
    * If list contains a cycle, this method will not return
    * and will happily loop forever :)
    */
   private Node<T> tail() {
      if (head == null) { return null; }
      Node<T> n = head;
      while (n.next() != null) {
         n = n.next();
      }
      return n;
   }

   /**
    * Returns ith element of the list (starting from 0).
    *
    * @throws IndexOutOfBoundsException if index is invalid.
    */
   public T get(int i) {
      // TODO: Homework :)
      // Plus any other features you're inspired to add
      // Here's how to throw an exception if the index is invalid:
      // throw new IndexOutOfBoundsException(i);
      return null;
   }

   public String toString() {
      if (head == null) { return "[]"; }
      String res = "[";
      Node<T> n = head;
      while (n != null) {
         res += n.toString();
         if (n.next() != null) { res += ", "; }
         n = n.next();
      }
      return res + "]";
   }

   public static void main(String[] args) {
      LinkedListFun<String> students = new LinkedListFun<>();
      students.add("andrei");
      students.add("ray");
      students.add("gus");
      students.add("maria");
      students.add("caleb");
      System.out.println("Students: " + students);
   }
}
