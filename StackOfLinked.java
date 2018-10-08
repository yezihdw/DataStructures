// 栈的链表实现
public class StackOfLinked<Item> implements Iterable<Item> {

  // 定义一个内部类
  private class Node{
    Item item;
    Node next;
  }

  private Node first;
  private int N;

  // 构造器
  public StackOfLinked(){

  }

  //
  public void push(Item item) {
    Node oldfirst = first;
    first = new Node();
    first.item = item;
    first.next = oldfirst;
    N++;
  }

  //
  public Item pop() {
    Item item = first.item;
    first = first.next;
    N--;
    return item;
  }

  //
  public boolean isEmpty() {
    return N == 0;
  }

  //
  public int size() {
    return N;
  }

  public Item peek() {
    return first.item;
  }

  @Override
  public Iterator<Item> iterator() {
    return new LinkedIterator();
  }

  class LinkedIterator implements Iterator {
    int i = N;
    Node t = first;

    @Override
    public boolean hasNext() {
      return i > 0;
    }

    @Override
    public Item next() {
      Item item = (Item)t.item;
      t = t.next;
      i--;
      return item;
    }
  }

}
