
package jachampagne;

public class Cottage  extends Building implements Flyable
{
    public Cottage()
    {
        System.out.println("Parcelle en place...");
    }
    
       

	void bulding(String material) {
        System.out.println("Construction du batiment en " + material);
    }

    
    public void fly() 
    {
        
        System.out.println(" la chaumière s'èlève peu dans les airs");  

    }
	
	}

