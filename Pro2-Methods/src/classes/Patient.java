package classes;

//USE SOURCE-->GENERATE GETTERS AND SETTERS
/*this set and get methods are 
 * used when you don't want anyone to change the variable 
 */
public class Patient {

	private String name;
		public void setName(String name){
			this.name=name;
		}
		public String getName(){
			return name;
		}
		
	private int age;
		// @return the age
		public int getAge() {
			return age;
		}
		//@param age the age to set
		public void setAge(int age) {
			this.age = age;
		}
		
	private int height;
		// @return the height
		public int getHeight() {
		return height;
		}
		//* @param height the height to set
		public void setHeight(int height) {
			this.height = height;
		}
	
	
}
