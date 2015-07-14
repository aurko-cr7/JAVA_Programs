import java.io.*;
class MyMain{
	public static void main (String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		SpecialNumber obj = new SpecialNumber (n);
		obj.display();
	}
}