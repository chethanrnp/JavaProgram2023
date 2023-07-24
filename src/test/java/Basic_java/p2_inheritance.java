package Basic_java;

public class p2_inheritance extends p1_inheritance{
          
	 String son="worst";
	 
	public void Display() {
		super.Display();
		System.out.println("creat a gaming ");
	}
	
public void Pic() {
		
		System.out.println("creating pic ");
	}

	public static void main(String[] args) {
	
//		 p1_inheritance p=new p2_inheritance();
//		 p2_inheritance p1=(p2_inheritance) p;
//	
//		System.out.println(p instanceof p1_inheritance);
//	    System.out.println(p instanceof p2_inheritance);
//	    p1_inheritance.name="Arya";
//	    
//	    System.out.println(p1_inheritance.name);
//		
////	 	p1_inheritance p1=new p2_inheritance();
////	 	System.out.println(p1.father);
////	 	p1.Display();
		
	   p1_inheritance p=new p2_inheritance();
	   System.out.println(p.father);
	   p.Display();
	System.out.println("-------------");   
	   p2_inheritance p1=(p2_inheritance) p;
	 	p1.Display();
	 	p1.Pic();
	 	System.out.println(p1.father);
	 	System.out.println(p1.son);
	 	System.out.println(p1_inheritance.name);
	 	
	 	System.out.println("-------------");   
	   p1_inheritance	c= new p1_inheritance();
	   
	   if (c instanceof p2_inheritance) {
		System.out.println("sucesfully downcasted");
	}
	   else {
		   System.out.println("unable to  downcasted");
	}
	}
}
