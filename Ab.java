class Ab{
	private int store_id;
	private String title;
	private String author;
	private String publisher;
	private double selling_price;
	private int quantity;
	static int sum;
	private int quantity_sold;
Ab(int store_id,String author,String title,String publisher,double selling_price,int quantity, int quantity_sold){
	this.store_id=store_id;
	this.title=title;
	this.author=author;
	this.publisher=publisher;
	this.selling_price=selling_price;
	this.quantity_sold=quantity_sold;
	this.quantity=quantity;
	this.sum+=quantity_sold;
}
void display_details(){
	System.out.println("quantity available for "+title+"of Store(Book ID: "+store_id+" ): "+quantity);
	System.out.println( quantity_sold+"copies of "+title+" sold for total price of $"+selling_price);
	int a1=quantity-quantity_sold;
	System.out.println("quantity available for "+title+" store(book ID :"+store_id+"):"+a1);
}
public static void main(String[] args){
	Ab a=new Ab(1,"j k rowling","harry potter","bloomsbury",99.9,50,10);
	Ab b=new Ab(2,"monk","AML","bear",90.99,80,5);
	a.display_details();
	b.display_details();
	System.out.println("total books sold "+a.sum);
}
}











