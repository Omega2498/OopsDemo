package OopsDemo1;
import java.util.*;
/* Java program to perform addition of 2 Time
 * t1 --> 12 : 45 :55
 * t2 --> 10 : 30 :30
 *
 * t1 + t2
 *   if sec> 60 .. mins should be incremented & sec -60,,
 *   if min> 60  ... hrs should be incremented & min -60
 */
public class Time
{
	int h= hours1 + hours2; 
	int m = minutes1 + minutes2; 
	int s= seconds1 + seconds2; 
	if (s >= 60) { 
	  m+=1; 
	  s =  s-60; 
	} 
	if ( m >= 60) { 
	   h+=1; 
	  m= m-60; 
	} 
	public Time()
	{
	}
	void print() {
		System.out.println("The Added time is:"+h+":"+m+":"+s);
	}

}
