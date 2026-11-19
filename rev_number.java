class rev_number{
  public static void main(String[] args) {
    // int scanner = sc.nextInt();
    int number = 1234;

    int reverse = 0;
    int rem = 0;
    while(number != 0){
      rem = number % 10;
      reverse = reverse * 10 + rem;
      number = number / 10;
    }

    System.err.println("Reversed: "+reverse);
  }
}