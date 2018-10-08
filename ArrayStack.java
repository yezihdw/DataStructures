// 基于数组实现顺序栈
public class ArrayStack {
  private String[] items; // 数组
  private int count; // 栈中元素个数
  private int n; // 栈的大小

  // 初始化数组，申请一个大小为 n 的数组空间
  public ArrayStack(int n) {
    this.items = new String[n];
    this.n = n;
    this.count = 0;
  }

  // 入栈
  public boolean push(String item) {
    // 数组空间不够，返回 false ，入栈失败
    if (count == n) return false;
    items[count] = item;
    ++count;
    return true;
  }

  // 出栈
  public String pop() {
    // 栈为空，返回 null
    if (count == 0) return null;
    // 返回下标为 count-1 的数组元素，并且栈中元素个数 count 减 1
    String tmp = items[count-1];
    --count;
    return tmp;
  }
}