import java.util.Random;
import java.util.Scanner;

public class input_num2 {

  Scanner scanner = new Scanner(System.in);
  Random random = new Random();

  public int num2;

  public input_num2() {

    System.out.println("2つ目の数字の入力方法を選択してください");
    System.out.println("1: 手入力");
    System.out.println("2: ランダム(1~100)");

    int select = 0;
    do {
        select = scanner.nextInt();
    } while(select != 1 && select != 2);
    

    if (select == 1) {
      System.out.print("2つ目の数字を入力してください：");

      num2 = scanner.nextInt();
    } else {

      num2 = random.nextInt(100) + 1;   
      System.out.println("ランダムで生成された数字：" + num2);
    }
  }
  
} 