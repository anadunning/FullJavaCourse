
public class Program {

	public static void main(String[] args) {

		String a = "Maria";
		String b = "Alex";

		System.out.println(a.equals(b));

		String c = "Maria";
		String d = "Alex";

		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println();
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		
		String e = "Andrew";  
        String f = "Andrew";  
  
        if(e.equals(f)){   //checking the equality of objects using equals() methods  
            System.out.println("e & f are equal variables, and their respective hashvalues are:" + " "+ e.hashCode() + " & " + f.hashCode());
        }  
  
        String g = "Maria";  
        String h= "Julie";
  
        if(!g.equals(h)){    //checking  the equality of objects using equals() method  
            System.out.println("\ng & h are Un-equal variables, and their respective hashvalues are:" + " "+ g.hashCode() + " & " + h.hashCode());  
        }
	}
}