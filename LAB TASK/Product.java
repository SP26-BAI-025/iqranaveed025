public class Product{
private String Id;
private double price;
private String name;
private int qty;
static private int count=1;
static int b=1;
static private double maxprice;
static private double miniprice;
private Date1 mf;
public Product (String name,double price,int quantity){
this(name,price,quantity,new Date1(1,1,1));
}

public Product (String name,double price,int quantity,Date1 mf){
this.Id = String.format("p%03d",count++);
this.name = name;
this.price = price;
this.qty = quantity;
this.mf=mf;
if(b==1){
miniprice=price;
maxprice=price;
}
if (price>maxprice){
   maxprice = price;}
if (price<miniprice)
   {miniprice = price;}
}

public void display(){
System.out.println("-------DISPLAY OF PRODUCT # "+b+"-------");
System.out.println("NAME:"+name);
System.out.println("PRICE:"+price);
System.out.println("QUANTITY:"+qty);
System.out.println("ID:"+Id);
System.out.println("MAXIMUM PRICE:"+maxprice);
System.out.println("MINIMUM PRICE:"+miniprice);
System.out.printf("MANUFACTURE DATE: %s%n",mf.toString());

b++;
}
}
