package created.thisFolder;

class Package1{
	public void show(){
		System.out.println("Inside Void - Called through Package");
	}
	public static void main(String[] args) {
         Package1 p = new Package1();
         p.show();		
	}
}

/* inside cmd 
1.   cd ->directory
2.   javac -d . Package1.java (This Creates folder created/thisFolder, and saves class file in it) - note how it is compiled using "-d"
3.   java created.thisFolder.Package1 (this runs the compiled code)

output:
Inside Void - Called through Package 
*/
