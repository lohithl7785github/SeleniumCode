
public class Logic {
	
  public int doTask(int numb) {
	  int last;
	  int rev = 0;
	  while(numb!=0) {
		  last = numb % 10; // 4
		  numb = numb/10;    // 1
		  rev = rev * 10 + last; // 0*10+4 = 4, 4*10+3= 3
	  }
	  return rev;
  }
  public static void main(String[] args) {
	  Logic logi = new Logic();
	  int res= logi.doTask(6543);
	  System.out.println("Result :"+res);
  }
  
}
