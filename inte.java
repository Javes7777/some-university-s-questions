import java.io.*;
import java.util.*;

class inte {
	public static void main(String args[])throws Exception  {
	Scanner sc = new Scanner(System.in);
	int n;											// size of array to be taken from user
	int target_integer;								//integer to be finded
	int low=0;
	
	
	
	
	ArrayList<Integer> arr = new ArrayList<Integer>();			//init of dynamic array
	
		
		System.out.println("Enter elements of array :-   (##type done to exit)   ");
		String inp;
		
		while(sc.hasNext()) {
			inp = sc.nextLine();
			
			try {
				int i = Integer.parseInt(inp);
					arr.add(i);		
			}catch(NumberFormatException e) { break; }
		}
		
		int high=arr.size();
		System.out.println("Enter sum to search :- ");
		target_integer = sc.nextInt();
		
		
		System.out.println("Sorting your array PLEASE WAIT!! ");
				Collections.sort(arr);	
			System.out.println("Finding the required numbers PLEASE WAIT!!");
			finder(arr,low,high,target_integer);
	}
	
	
	
	public static void finder(ArrayList<Integer> arr,int low,int high,int target_integer) {
		int mid = 0;
		int x=0;
		int n=0;
		int sum=0;
		
		while(low<high) {
			mid = (low+high)/2;
			x=arr.get(n);
        sum = x+arr.get(mid);
				if(sum==target_integer){
					System.out.println("Number1 = "+x+" Number2 = "+arr.get(mid));
					break;
				}else if(sum<target_integer && low<high && low < mid) {
					low = mid;
				}else {
					n++;
					low =n;
					
				}
      }
	}
	
	
}