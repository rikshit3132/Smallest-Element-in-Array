class Smallest_Element{
	public static void main(String args[]){
		
		int arr[]={1,5,2,4};
		int element=arr[0];
		int i,c=0;
		for(i=0;i<arr.length;i++){
			if(element>arr[i]){
				element=arr[i];
				c=i;

			}
		}
		System.out.println("Smallest element is:\n"+element+"\nat position\n"+c);
	}
}