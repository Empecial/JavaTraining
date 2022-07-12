public class SwitchTest {

  public static void main(String[] args) {
    int accesLevel = 2;
    String role = accesLevel == 2 ? "Admin" : "Guest";

    switch (role) {
      case "Admin":
        System.out.printf("You are an %s", role);
        break;
      case "Guest":
        System.out.printf("You are a %s", role);
        break;
      default:
        System.out.printf("You are a guest");
    }
  }
}
