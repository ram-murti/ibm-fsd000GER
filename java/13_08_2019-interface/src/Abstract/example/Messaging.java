package Abstract.example;

public class Messaging {
 private String message;
 private static Messaging messaging;
 
 private Messaging(String message) {
	 this.message=message;
 }
 private Messaging() {
	 
 }
 public String getMessage() {
	 return message;
	 
 }
 public void setMessage (String message) {
	 this.message=message;
 }
 @Override
 public String toString() {
	 return "messaging{"+"message='"+message+'\''+'}';
 }
 public static Messaging createMessagingObject() {
	 if(messaging==null) {
		 messaging=new Messaging();
	 }
	 return messaging;
 }
 public static Messaging createMessagingObject(String Message) {
	 if(messaging==null) {
		 messaging=new Messaging(Message);
	 }
	 return messaging;
 }
}
