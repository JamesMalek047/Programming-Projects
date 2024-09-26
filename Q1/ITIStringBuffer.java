public class ITIStringBuffer {
    SinglyLinkedList<String> bufferList;
    private int lengthholder;

    // public ITIStringBuffer() {
    //     //throw new UnsupportedOperationException( "replace with your implementation" );
    //     bufferList = new SinglyLinkedList<String>();
    // }



    public ITIStringBuffer(String  firstString){
       // throw new UnsupportedOperationException( "replace with your implementation" );
       if(firstString == null){
        throw new IllegalArgumentException("the string is null");
    }
    bufferList = new SinglyLinkedList<String>();
    bufferList.addFirst(firstString);
    lengthholder += firstString.length();
    
    }

    public void append(String nextString){
        throw new UnsupportedOperationException( "replace with your implementation" );
        // if(firstString == null){
        //     throw new IllegalArgumentException("the string is null");
        // }
        // mylist = new SinglyLinkedList<String>();
        // mylist.addFirst(firstString);
        // lengthholder += firstString.length();
    }

    public String toString(){
        throw new UnsupportedOperationException( "replace with your implementation" );
        int counter = 0;
        char[] mychar_holder;
        char[] mychar_final;

        mychar_final = new char[lengthholder];



        for(String holder : mylist){

            mychar_holder = holder.toCharArray();

            for(int i = 0; i < (mychar_holder).length; i++){
                mychar_final[counter] = (mychar_holder[i]);
                counter++;

            }

        }
        String myholder = new String(mychar_final);

        return myholder;
    }
}


