package duke.choice;

import java.util.Arrays;

public class shopApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Duke Shop app!");
		Customer c1=new Customer();
		int measurement=2;
		c1.setName("Pinky");
		c1.setSize("S");
		/*switch(measurement)
		
		{
		case 3: case 2: case 1:
			c1.size="S";
		break;
		case 6:case 5: case 4:
			c1.size="M";
		break;
		case 9:case 8: case 7:
			c1.size="L";
		break;
		default:
			c1.size="X";
		
		}*/
		System.out.println("The customer name is "+c1.getName());
		Clothing item1=new Clothing();
		Clothing item2=new Clothing();
		Clothing item3=new Clothing();
		Clothing item4=new Clothing();
		Clothing[] items= {item1,item2,item3,item4};
		
		item1.setDescription("Blue Jacket");
		item1.setPrice(20.9);
		item1.setSize("S");
		
		item2.setDescription("Orange T-shirt");
		item2.setPrice(20.9);
		item2.setSize("S");
		
		item3.setDescription("Green Scorf");
		item3.setPrice(20.9);
		item3.setSize("S");
		
		item4.setDescription("Blue T-Shirt");
		item4.setPrice(20.9);
		item4.setSize("S");
		
		//System.out.println("item1 ,"+item1.description+","+item1.price+","+item1.size);
		//System.out.println("item2 ,"+item2.description+","+item2.price+","+item2.size);
		//(item1.price+2*item2.price)+(item1.price+2*item2.price)*tax;
		
		Double Total=0.0;
		for(Clothing item:items)
		{
			if(c1.getSize().equals(item.getSize()))
			{
			Total= Total+item.getPrice();
			System.out.println("item ,"+item.getDescription()+","+item.getPrice()+","+item.getSize());
			}
			if(Total>15)
				break;
		}
		System.out.println("Total amount to be paid including the taxxx "+ Total);
		System.out.println("The size is "+ c1.getSize());
		//System.out.println(item1+" "+item2+" "+item3+" "+item4);
		Arrays.sort(items);
		for(Clothing item:items)
		{
			System.out.println(item);
			
		}
		
		System.out.println("Git Commited");
		
	}

}
