class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}


	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
     LinkedListNode<Integer> two=head;
       LinkedListNode<Integer> one=null;
       LinkedListNode<Integer> three=null;
     int i=0;
  
      while(i<k&&two!=null){
        three=two.next;
        two.next=one;
        one=two;
        two=three;
        i++;
      }
       
      if( three!=null){
       head.next=kReverse(three,k);
     }
      
     return one;
      
    }