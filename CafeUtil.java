import java.util.ArrayList;

/**
 * CafeUtil
 */
public class CafeUtil {
  public int getStreakGoal(int numWeeks) {
    int sum = 0;
    for (int i = 1; i <= numWeeks; i++) {
      sum += i;
    }
    return sum;
  }

  double getOrderTotal(double[] prices) {
    double sum = 0;
    for (double price : prices) {
      sum += price;
    }
    return sum;
  }

  void displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
    for (int i = 0; i < menuItems.size(); i++) {
      System.out.println(String.format("%d %s -- $%.2f", i, menuItems.get(i), prices.get(i)));
    }
  }

  void addCustomer(ArrayList<String> customers) {
    System.out.println("Please enter your name: ");
    String userName = System.console().readLine();
    System.out.println(String.format("Hello, %s!", userName));
    System.out.println(String.format("There are %d customers in front of you.", customers.size()));
    customers.add(userName);
    System.out.println(customers);
  }

  void printPriceChart(String product, double price, int maxQuantity) {
    System.out.println(product);
    for (int i = 1; i <= maxQuantity; i++) {
      double discount = 0.5 * (i - 1);
      System.out.println(String.format("%d - $%.2f ... $%.2f off!", i, price * i - discount, discount));
    }
  }

  void addCustomers(ArrayList<String> customers) {
    String name = "";
    while (true) {
      System.out.println("Please enter a name (or type 'q' when finished): ");
      name = System.console().readLine();
      if (name.equals("q")) {
        break;
      }
      customers.add(name);
      System.out.println(customers);
    }
  }
}