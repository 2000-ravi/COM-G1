public class Test{
    private int stk[];
    private int top;

    public Test(){
        stk=new int[10];
        top=-1;

    }

    public boolean isEmpty(){

        return top == -1;
    }

<<<<<<< HEAD
    public boolean isFull(){

        return top = stk.length -1;

    }

    public void push(int item){

        if isFull(){
            System.out.println(x:"Stack is overflow");
        }
        else{
            stk[++top] = item;
=======
    public int pop(){

        if(isEmpty()){
            System.out.println(x:"Stack is underflow");
            return 0;
            }
        else{
            int item = stk[++top];
            return item;
>>>>>>> f2
        }
    }

    public void display(){

        if (isEmpty()){
            System.out.println(x:"Stack is underflow");
        }
        else{
            for(int i=top; i>=0 i--){
                System.out.println(stk[]);
            }

        }
    }
}