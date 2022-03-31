class Bookk	 implements Comparable<Bookk> {

	int id;
	String name;
	String author;
	int price;
	

	public Bookk(int id, String name, String author, int cost) {
	super();
	this.id = id;
	this.name = name;
	this.author = author;
	this.price = cost;
}


	@Override
	public String toString() {
		return "Book [ID=" + id + ", NAME=" + name + ", AUTHOR=" + author + ", PRICE=" + price + "]";
	}

	public int compareTo(Bookk bo)
	{
		if(price==bo.price)
			return 0;
		else if(price>bo.price)
			return 1;
		else
				return -1;
	}
}
