public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Baguio baguio) { 
        if (baguio.airFare > budget) {
            System.out.println("Hindi ka muna mag ba-baguio! "); 
        }
        else {
            System.out.println("Dito na ako sa Baguio!!! ");  
            budget = budget - baguio.airFare;
        } 
        checkBudget();
    }   

    public void visit(Bohol bohol) {
        if (bohol.airFare > budget) {
            System.out.println("Hindi ka muna mag bo-bohol! "); 
        }
        else {
            System.out.println("Dito na ako sa Bohol!!! ");  
            budget = budget - bohol.airFare;
        } 
        checkBudget();
    }
    
    public void visit(Boracay boracay) {
        if (boracay.airFare > budget) {
            System.out.println("Hindi ka muna mag bo-boracay! "); 
        }
        else {
            System.out.println("Dito na ako sa Boracay!!! ");  
            budget = budget - boracay.airFare;
        } 
        checkBudget();
    }

    public void visit(Batangas batangas) {
        if (batangas.airFare > budget) {
            System.out.println("Hindi ka muna mag ba-batangas! ");     
        }
        else {
            System.out.println("Dito na ako sa Batangas!!! ");  
            budget = budget - batangas.airFare;
        } 
        checkBudget();
    }

    public void visit(Palawan palawan) {
        if (palawan.airFare > budget) {
            System.out.println("Hindi ka muna pupunta ng Palawan! "); 
        }
        else {
            System.out.println("Dito na ako sa Palawan!!! ");  
            budget = budget - palawan.airFare;
        } 
        checkBudget();
    }
   
    public void visit(Tagaytay tagaytay) {
        if (tagaytay.airFare > budget) {
            System.out.println("Hindi ka muna pupunta ng Tagaytay! ");   
        }
        else {
            System.out.println("Dito na ako sa Tagaytay!!! ");  
            budget = budget - tagaytay.airFare;
        } 
        checkBudget();
    }
    
    public void checkBudget() {
        System.out.println("my budget is " + budget );
    }
    
}