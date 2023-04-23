package week1.day1;

public class Mobile {
public void sendSMS() {
 System.out.println("send SMS");

}

private void allowvoicecall() {
	System.out.println("allowvoicecall");
}

private void takevideo() {
	System.out.println("takevideo");

}

public static void main(String[] args) {
	Mobile obj=new Mobile();
	obj.allowvoicecall();
	obj.sendSMS();
	obj.takevideo();
}
}
