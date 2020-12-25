import javax.swing.*;
import java.util.Scanner;
public class Main{
	
	static String printDivisors() 
    { 
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int n=num;
		String s="";
        for (int i=2;i<=n-1;i++) 
            if (n%i==0) 
            	s+=Integer.toString(i)+" "; 
        
        return s;
    } 
	
	JFrame f;
	Main(){
		
		f = new JFrame();
		String s=printDivisors();
		JOptionPane.showMessageDialog(f,"Nontrivial divisors of :"+ s ); 
	}
	
    public static void main(String args[]) 
    {  	
    	new Main();
        
    } 
}
