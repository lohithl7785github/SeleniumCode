
public class DoWhile {
    public static void doTask(int n) {
    	
    	int a = 0;
    	int count = 0;
    	do {
    		System.out.println(a++);
    		count++;
    		
    	} while(count<=n);
//    	0 = a=1 , count =1, 1<=7 = T
//        1 = a=2, count =2, 2<=7 = T
//        2 = a=3, count = 3, 3<=7 = T
//        3 = a=4, count = 4, 4<=7 = T
//        4 = a=5, count = 5, 5<=7 = T
//        5 = a=6, count = 6, 6<=7 = T
//        6= a=7, count = 7 , 7<=7 =T
//        7 = a=8, count = 8, 8 <=7 =F (LOOP Stop)
//    	
    }
    public static void dowhileTask(int n) {
    	int count = 0;
    	while(count <= n) {
    		System.out.println(count);
    		count++;
    		
    	}
//    	1 = count = 2, 2<=7 -> T
//    	2 = count = 3, 3<=7 -> T
//    	3 = count = 4, 4<=7 => T
//    	4 = count = 5, 5<=7 => T
//    	5 = count = 6  6 <= 7 =>t 
//    	6 = count = 7  7<=7 => T
//    	7 = count = 8 8<=8 => F (Loop Stop)
    }
//    public static void task(int n) {
//    	int count = 0;
//    	System.out.println(count++);
//    	int res = count;
//    	System.out.println(res);
//    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          doTask(7);
         //dowhileTask(7);
		
	}

}
