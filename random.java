import java.util.Random;
import java.util.Scanner;

class random {
  public static void main(String args[]) {
	Random rand = new Random();
	int num = rand.nextInt(100) + 1;

	while (true){

		System.out.println("数字を入力して当てて下さい");
		Scanner scanner = new Scanner(System.in);
		int next = scanner.nextInt();
	
		if ( num == next){
			System.out.println("当たり");
			break;
		}else if (num > next){
			System.out.println("上です");
		}else {
			System.out.println("下です");
		}
	}
  }
}
