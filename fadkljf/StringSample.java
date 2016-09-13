package pracitce.ravi;

import java.util.*;
public class StringSample
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String s=in.nextLine();
    String arr[] = s.split(" ");
    ArrayList<Integer> al = new ArrayList<Integer>();
    for(int i=0;i<arr.length;i++)
    {
      al.add(arr[i].length());
      //System.out.println(arr[i]);
    }
    Collections.sort(al);
    ArrayList<String>  li = new ArrayList<String>();
    
    for(int j=al.size()-1;j>=0;j--)
    {
     int x=al.get(j);
      for(int i=0;i<arr.length;i++)
        if(x==arr[i].length())
        {
          if(!li.contains(arr[i]))
          {
            li.add(arr[i]);
          }
        }
    }
    for(String s1:li)
    {
      System.out.print(s1+" ");
    }
  }
}