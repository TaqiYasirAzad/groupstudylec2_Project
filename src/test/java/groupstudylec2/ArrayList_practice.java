package groupstudylec2;

import java.util.ArrayList;

public class ArrayList_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//store 5 Fruits in Wlmart inventory using ArrayList
		//Apple, Grapes, Cherry, Orange, Kiwi
		
		ArrayList<String> Fruits=new ArrayList <String>();
		
		Fruits.add ("Apple");
		Fruits.add ("Grapes");
		Fruits.add ("Cherry");
		Fruits.add ("Orange");
		Fruits.add ("Kiwi");
		
		
		//how to Access all 5 Fruits in the data by using get method or get keyword 
		
				Fruits.get(0);
				Fruits.get(1);
				Fruits.get(2);
				Fruits.get(3);
				Fruits.get(4);
				
		//replace All 5 fruits with 5 vegetable potato, eggplant, tomato, cabbage, pepper 
				Fruits.set(0,"potato");
				 Fruits.set(1,"eggplant");
				 Fruits.set(2,"tomato");
				 Fruits.set(3,"cabbage");
				 Fruits.set(4," pepper ");
				 
				//  remove one vegetable using the remove method. 

				 Fruits.remove(0);
				
				 
				 //size
				   Fruits.size();
				   
				   // for loop
				   
				   Fruits.add ("Apple");
					Fruits.add ("Grapes");
					Fruits.add ("Cherry");
					Fruits.add ("Orange");
					Fruits.add ("Kiwi");
					
				   for (int i = 0; i < Fruits.size(); i++) {
					   System.out.println(Fruits.get(i));
				   }
				 
				 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
