public class rev_a_string {
  public static void main(String[] args) {
    String name = "rahul";
    int length = name.length();
    String result = "";

    for (int i = length - 1; i >= 0; i--) {
      result += name.charAt(i);
    }
    System.out.println(name);
    System.out.println("reversed: " + result);
  }
}
