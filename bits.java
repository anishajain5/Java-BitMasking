package Bit_masking;

public class bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=16;
		int next= x<<3;
		System.out.println(next);
		System.out.println(power(23));
		System.out.println(extract_bit(5, 2));
		System.out.println(right_most_set_bit(128));
		System.out.println(count_set_bits(36));

	}
	public static boolean power(int num) {
		if(num!=0 && num!=1) {
			if((num & (num-1))==0) {
				return true;
			}
		}
		return false;
	}
	
	public static int extract_bit(int num, int pos) {
		int mask=1;
		mask= mask<<pos-1;
		if((num&mask)==0) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
	public static int count_set_bits(int num) {
		int count=0;
		int mask=1;
		while(num!=0) {
			if((num&mask)!=0) {
				count++;
			}
			num=num>>1;
		}
		return count;
	}
	
	public static int right_most_set_bit(int num) {
		int pos=1;
		int mask=1;
		while((num&mask)==0) {
			mask=mask<<1;
			pos++;
		}
		return pos;
	}
	
	

}
