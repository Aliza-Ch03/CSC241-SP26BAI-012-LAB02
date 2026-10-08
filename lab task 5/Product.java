public class Product{
     private String id;
     private double price;
     private int quantity;
     private Date md;
     private String name;
     static  private double minPrice;
     static  private double maxPrice;
     static int counter=0; 
    

     public Product(String name,double price,int quantity){
          this(name,price,quantity,new Date(1,1,1));
         
         
         
}
       public Product(String name,double price,int quantity,Date md){
          counter++;
          this.name=name;
          this.price=price;
       
          this.quantity=quantity;
          this.md=md;

         if (counter == 1){

          maxPrice = price;
          minPrice = price;
         }
        if(counter>1 && minPrice>price){
           minPrice=price;
           }
        if(counter>1 && maxPrice<price){
           maxPrice=price;
           }
         
          id = String.format("p%03d",counter);
         
}
   
     public  void displayProduct(){ 
     System.out.println("Name:" + name);
     System.out.println("Price:" + price);
     System.out.println("Quantity:" + quantity);
     System.out.println("Id:" + id); 
     md.displayDate();
              
  
  }
    static void displayMaxMin(){
    System.out.println("MinPrice:"  + minPrice);
    System.out.println("MaxPrice:"  + maxPrice);
 }
}   