class room{
	int roomno;
	String room_type;
	double room_area;
	room(){
		roomno=102;
		room_type="XYZ";
		room_area=1275;
	}
	room(int x,String y,double z){
		roomno=x;
		room_type=y;
		room_area=z;
	}
	void display(){
		System.out.println("\n\t Room Number : "+roomno);
		System.out.println("\t Room Type   : "+room_type);
		System.out.println("\t Room Area   : "+room_area+"sqcm");
	}
	public static void main(String[] args) {
		room r1 = new room();
		room r2 = new room(101,"AC",1000);
		System.out.println("\n\t\t\t Room details ");
		r1.display();
		r2.display();
	}
}