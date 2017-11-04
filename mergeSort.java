
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
public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head1) {
 
  LinkedListNode<Integer> slow=head1;
  LinkedListNode<Integer> fast =head1.next;
  LinkedListNode<Integer> middle;
  LinkedListNode<Integer> head2;

  if(head1==null||head1.next==null){
    return head1;
  }
  while(fast==null||fast.next == null){
    fast = fast.next.next;
    slow= slow.next;
  }
  middle=slow;
  head2 = middle.next;
  middle.next=null;
 LinkedListNode<Integer> left= mergeSort(head1);
 LinkedListNode<Integer> right= mergeSort(head2);
 LinkedListNode<Integer> ans= mergeTwoList(left,right);
  return ans;

}



public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
 
  LinkedListNode<Integer> head ;
  LinkedListNode<Integer> tail;
  if(head1.data.compareTo(head2.data)<=0){
    head=head1;
    tail=head1;
    head1=head1.next;
  }
  else{
    head=head2;
    tail=head2;
    head2=head2.next;
  }

  while(head1!=null && head2!=null){
       if(head1.data.compareTo(head2.data)<=0){
    tail.next=head1;
    head1=head1.next;
    tail=tail.next;
  }
  else{
    tail.next=head2;
    head2=head2.next;
    tail=tail.next;
   
  }
    
    }
  tail.next=head1==null?head2:head1;
  return head;
   
  
    
}