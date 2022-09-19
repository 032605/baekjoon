public class Main{

	public static void main(String[] args) {

		boolean[] arr = new boolean[10001];
		
		for(int i=0; i<10000+1; i++) {
			int n = d(i);
			
			if(n < 10001) {
				arr[n] = true;	//함수 리턴 값이 10000이하 인 것만 배열에 넣기
			}
		}

		for(int i=0; i<arr.length; i++) {
			if(!arr[i])
				System.out.println(i);	//배열 값이 false인 것 (셀프넘버) 출력
		}
	}

	public static int d(int num) {
		
		int sum = num; 
		
		while(num != 0) {
			sum += num % 10;	// 첫째 자리수 
			num /= 10;			// 그 다음 자리수를 위해 10 나누기
		}
		
		return sum;
	}

}