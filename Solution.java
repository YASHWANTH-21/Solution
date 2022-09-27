import java.util.*;
class Solution{

public int findNumOfStepsRequired(int a,int b)
{
return a*b;
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	Ha obj = new Ha();
	System.out.println(obj.findNumOfStepsRequired(a,b));
}
}
