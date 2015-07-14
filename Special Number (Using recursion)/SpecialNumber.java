class SpecialNumber {
	int n;
	public SpecialNumber(int n){
		this.n=n;
	}
	public int checkSpecialNumber(int n1) {
		int x = calculateSumOfDigits(n1,0);
		if (x>=10)
			return checkSpecialNumber(x);
		else 
			return x;
	}
	public int calculateSumOfDigits(int y, int sum){
		sum+=y%10;
		y/=10;
		if (y!=0)
			return calculateSumOfDigits(y, sum);
		else
			return sum;
	}
	public void display(){
		if(checkSpecialNumber(n)==1)
			System.out.println("Special number");
		else
			System.out.println("Not a special number");

	}
}