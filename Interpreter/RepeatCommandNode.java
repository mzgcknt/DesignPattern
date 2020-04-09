public class RepeatCommandNode extends Node {
    private int number;
    private Node commandListNode;
    public void parse(Context context) throws ParseException {
        context.skipToken("repeat");
        number = conotext.currentNumber();
        context.nextToken();
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }
    public String toString() {
        return "[repeat " +number +" " +commandListNode +"]";
    }
}
