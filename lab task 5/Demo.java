public class Demo{
      public static void main(String[] args){
       
     Product p1 = new Product("pen", 20, 2);
     Product p2 = new Product("pencil", 30, 3);
     Product p3 = new Product("pointer", 40, 5);
     Product p4 = new Product("notebook", 50, 6,new Date());


     p1.displayProduct();
     p1.displayMaxMin();
     System.out.println(" ");

     p2.displayProduct();
     p2.displayMaxMin();
     System.out.println(" ");

     p3.displayProduct();
     p3.displayMaxMin();
     System.out.println(" ");

     p4.displayProduct();
     p4.displayMaxMin();
     System.out.println(" ");


}
}
