package LogicBuilding;

import java.util.ArrayList;

public class ArrayListMax {

	public static void main(String[] args) {
		 ArrayList<String> arr=new ArrayList<>();
		 arr.add("Arun#12#12#12");
		 arr.add("Deepak#13#12#12");
		 String[] str=new String[arr.size()];
		 String st="";
		 String first="";
		 for(int i=0;i<arr.size();i++)
		 {
			 st+=arr.get(i)+"#";
		 }
		 str=st.split("#");
		 int max=0;int pos=0;
      for(int i=0;i<str.length;i++)
      {
    	  max=Integer.parseInt(str[1]);
    	  if(i!=0 && i!=4)
    	  {
    		  if(max<Integer.parseInt(str[i]))
    		  {
    			  max=Integer.parseInt(str[i]);
    			  pos=i;
    		  }
    	  }
    	  
    	  if(pos<4)
    	  {
    		  first=str[0];
    	  }
    	  else
    	  {
    		  first=str[4];
    	  }
      }
      System.out.println(first);
	}
}
