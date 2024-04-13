public class whatNext<String> {
    public String iCanTakeIt;

    whatNext(String classParameter){
        this.iCanTakeIt = classParameter;
    }

    public void typeOfNextToDo(String type){
        System.out.print("What next for you to do is to "+ this.iCanTakeIt + " and the type" +
                "of what to " + this.iCanTakeIt + " is " +
                        type
                );
    }

}